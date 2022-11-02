package liga.medical.personservice.core.utils;

import liga.medical.personservice.core.api.LogHelper;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class LogHelperImpl implements LogHelper {
    @Override
    public String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date(System.currentTimeMillis());
        return timeFormat.format(currentTime);
    }

    @Override
    public String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date(System.currentTimeMillis());
        return dateFormat.format(currentDate);
    }

    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }
}
