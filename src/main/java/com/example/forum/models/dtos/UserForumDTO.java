package com.example.forum.models.dtos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserForumDTO {

    private Long user_id;
    private String user_name;
    private List<ForumDTO> forumDTOList;

    public UserForumDTO() {
    }

    public UserForumDTO(String user_name, List<ForumDTO> forumDTOList) {
        this.user_name = user_name;
        this.forumDTOList = forumDTOList;
    }

    public UserForumDTO(Long user_id, String user_name, List<ForumDTO> forumDTOList) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.forumDTOList = forumDTOList;
    }
}
