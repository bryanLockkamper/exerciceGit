package be.bstorm.demo.models;

import lombok.Data;

import javax.persistence.*;

// region MyCode
@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long id;

    @Column(name = "message_body")
    private String body;

    // pas de mapped car class propriétaire de la ref
    @ManyToOne(targetEntity = Topic.class)
    @JoinColumn(name = "topic_id")
    private Topic topic;


    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

}
// endregion
