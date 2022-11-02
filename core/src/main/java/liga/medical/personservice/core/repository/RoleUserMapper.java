package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.dto.UserRoleDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserMapper {
    @Insert(value = "INSERT INTO users_roles VALUES (#{userId}, #{roleId});")
    Integer insertUserRole(UserRoleDto userRoleDto);
}
