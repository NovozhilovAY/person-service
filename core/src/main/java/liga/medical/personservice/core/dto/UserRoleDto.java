package liga.medical.personservice.core.dto;

import liga.medical.personservice.core.model.Role;
import liga.medical.personservice.core.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class UserRoleDto {

    private Long userId;

    private Long roleId;

    public static List<UserRoleDto> fromUser(User user) {
        List<UserRoleDto> userRoleDtoList = new ArrayList<>();
        for (Role role: user.getRoles()) {
            userRoleDtoList.add(new UserRoleDto(user.getId(), role.getId()));
        }
        return userRoleDtoList;
    }

}
