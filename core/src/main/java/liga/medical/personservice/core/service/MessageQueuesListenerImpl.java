package liga.medical.personservice.core.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liga.commonmodule.core.api.LogService;
import liga.medical.dto.annotations.DbLog;
import liga.medical.dto.dto.RabbitMessageDto;
import liga.medical.personservice.core.api.MessageQueuesListener;
import liga.medical.personservice.core.config.RabbitConfig;
import liga.medical.personservice.core.exceptions.ResourceNotFoundException;
import liga.medical.personservice.core.model.Signal;
import liga.medical.personservice.core.repository.PersonDataRepository;
import liga.medical.personservice.core.repository.SignalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageQueuesListenerImpl implements MessageQueuesListener {

    private final SignalRepository signalRepository;

    private final PersonDataRepository personDataRepository;

    private final LogService logService;

    public MessageQueuesListenerImpl(SignalRepository signalRepository, PersonDataRepository personDataRepository, LogService logService) {
        this.signalRepository = signalRepository;
        this.personDataRepository = personDataRepository;
        this.logService = logService;
    }

    @Override
    @DbLog
    @RabbitListener(queues = RabbitConfig.DAILY_QUEUE_NAME)
    public void listenDailyQueue(String message) throws ResourceNotFoundException, JsonProcessingException {
        handleMessage(message);
    }

    @Override
    @DbLog
    @RabbitListener(queues = RabbitConfig.ALERT_QUEUE_NAME)
    public void listenAlertQueue(String message) throws ResourceNotFoundException, JsonProcessingException {
        handleMessage(message);
    }

    private void handleMessage(String message) throws JsonProcessingException, ResourceNotFoundException {
        ObjectMapper objectMapper = new ObjectMapper();
        RabbitMessageDto messageDto = objectMapper.readValue(message, RabbitMessageDto.class);
        if (!personDataRepository.existsById(messageDto.getId())) {
            throw new ResourceNotFoundException("User with id = " + messageDto.getId() + " does not exist!");
        }
        Signal signal = new Signal();
        signal.setDescription(messageDto.getDescription());
        signal.setMessageType(messageDto.getMessageType());
        signal.setPersonDataId(messageDto.getId());
        signalRepository.save(signal);
        log.info(message);
    }
}
