package be.bstorm.demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "guillaume_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;

    private String label;

    @ManyToMany(targetEntity = User.class, mappedBy = "groups")
    private Set<User> users;
    @ManyToMany(targetEntity = Role.class)
    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }
}
