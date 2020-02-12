package be.bstorm.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
//region MyCode

@Data
@Entity
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forum_id")
    private Long id;
    @Column(name = "forum_label")
    private String label;
    @Column(name = "forum_date")
    private LocalDate date;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(targetEntity = Topic.class, mappedBy = "forum")
    private Set<Topic> topics;


}
// endregion
