package com.example.forum.Dal.Entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Forum_Id")
    private Long id;

    @Column(name = "Date_de_creation")
    private Date dateDeCreation;

    @Column(name ="Forum_name")
    private String nom;

    

}
