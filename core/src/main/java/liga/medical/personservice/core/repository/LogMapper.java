package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.dto.LogAuthDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    @Insert("INSERT INTO auth_log VALUES (#{id}, #{date}, #{time}, #{userName});")
    Integer logAuthAttempt(LogAuthDto logAuthDto);
}
