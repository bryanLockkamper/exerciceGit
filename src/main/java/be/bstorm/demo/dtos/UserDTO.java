package be.bstorm.demo.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String pseudo;
    private String email;
    private ContactInfoDTO contactInfo;

    private Set<GroupDTO> groups;
    private Set<UserTmpRoleDTO> roles;
}
