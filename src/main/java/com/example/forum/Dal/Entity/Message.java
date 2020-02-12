package com.example.forum.Dal.Entity;

import lombok.*;

import javax.persistence.*;
import javax.sql.DataSource;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {

    @Id
    @Column(name = "Message_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @OneToOne
    @Column(name = "Message_ID_USER")
    private Long ID_USER;
    @OneToOne
    @Column(name = "Message_ID_FORUM")
    private Long ID_FORUM;
    @Column(name = "Message_Content")
    private String content;
    @Column(name = "Message_date_creation")
    private Date date_creation;

}
