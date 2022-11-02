package liga.medical.personservice.core.service;

import liga.medical.personservice.core.api.LogHelper;
import liga.medical.personservice.core.api.LogService;
import liga.medical.personservice.core.dto.LogAuthDto;
import liga.medical.personservice.core.dto.LogRestDto;
import liga.medical.personservice.core.repository.LogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogServiceImpl implements LogService {

    private LogHelper logHelper;

    private LogMapper logMapper;

    public LogServiceImpl(LogHelper logHelper, LogMapper logMapper) {
        this.logHelper = logHelper;
        this.logMapper = logMapper;
    }

    @Override
    public void logRest(String className, String methodName) {
        LogRestDto logRestDto = new LogRestDto();
        logRestDto.setId(logHelper.getId());
        logRestDto.setDate(logHelper.getCurrentDate());
        logRestDto.setTime(logHelper.getCurrentTime());
        logRestDto.setClassName(className);
        logRestDto.setMethodName(methodName);
        logRestDto.setUserName(this.getUsername());
        log.info(logRestDto.toString());
    }

    @Override
    public void logAuth(String username) {
        LogAuthDto logAuthDto = new LogAuthDto();
        logAuthDto.setId(logHelper.getId());
        logAuthDto.setTime(logHelper.getCurrentTime());
        logAuthDto.setDate(logHelper.getCurrentDate());
        logAuthDto.setUserName(username);
        log.info(logAuthDto.toString());
        logMapper.logAuthAttempt(logAuthDto);
    }

    private String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
