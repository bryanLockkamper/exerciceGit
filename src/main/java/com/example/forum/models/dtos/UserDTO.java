package com.example.forum.models.dtos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDTO {

    private Long user_id;
    private String login;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserDTO(Long user_id, String login, String password) {
        this.user_id = user_id;
        this.login = login;
        this.password = password;
    }
}
