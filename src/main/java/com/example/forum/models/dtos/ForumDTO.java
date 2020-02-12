package com.example.forum.models.dtos;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ForumDTO {

    private String name;
    private LocalDate date;
    private List<MessageDTO> message;


}
