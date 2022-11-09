package liga.medical.personservice.core.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.personservice.core.exceptions.ResourceNotFoundException;

public interface MessageQueuesListener {
    void listenDailyQueue(String message) throws ResourceNotFoundException, JsonProcessingException;

    void listenAlertQueue(String message) throws ResourceNotFoundException, JsonProcessingException;
}
