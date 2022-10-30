package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select(value = "SELECT * FROM roles WHERE role = #{roleName};")
    Role getRoleByName(@Param("roleName") String roleName);
}
