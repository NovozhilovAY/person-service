package liga.medical.personservice.core.dto;

import lombok.Data;

@Data
public class LogAuthDto {
    private String id;
    private String date;
    private String time;
    private String userName;

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", user='" + userName + '\'';
    }
}
