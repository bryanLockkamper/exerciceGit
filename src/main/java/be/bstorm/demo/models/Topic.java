package be.bstorm.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

// region MyCode
@Entity
@Data
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private Long id;

    @Column(name = "topic_subject")
    private String subject;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(targetEntity = Forum.class)
    @JoinColumn(name = "forum_id")
    private Forum forum;

    @OneToMany(targetEntity = Message.class, mappedBy = "topic")
    private Set<Message> messages;


}

// endregion
