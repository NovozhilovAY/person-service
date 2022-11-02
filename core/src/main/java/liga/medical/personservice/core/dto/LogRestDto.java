package liga.medical.personservice.core.dto;

import lombok.Data;

@Data
public class LogRestDto {
    private String id;
    private String date;
    private String time;
    private String className;
    private String methodName;
    private String userName;

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", class='" + className + '\'' +
                ", method='" + methodName + '\'' +
                ", user='" + userName + '\'';
    }
}
