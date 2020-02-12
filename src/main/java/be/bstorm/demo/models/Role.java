package be.bstorm.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

// region MyCode
@Entity
@Data
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_label")
    private String label;

    @ManyToMany(targetEntity = Group.class, mappedBy = "roles")
    private Set<Group> groups;

    @OneToMany(targetEntity = UserTmpRole.class, mappedBy = "tmpRoleId.role")
    private Set<User> users;
}
// endregion
