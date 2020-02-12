package be.bstorm.demo.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
@NamedQuery(query = "SELECT u FROM User u", name = "SELECT_ALL")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_pseudo", nullable = false)
    private String pseudo;
    @Column(name = "user_email", nullable = false)
    private String email;

    @Embedded
    private ContactInfo contactInfo;

    //region MyCode
    @OneToMany(targetEntity = Forum.class, mappedBy = "user")
    private Set<Forum> forums;
    @OneToMany(targetEntity = Topic.class)
    private Set<Topic> topics;
    @OneToMany(targetEntity = Message.class)
    private Set<Message> messages;
    //endregion

    @ManyToMany(targetEntity = Group.class)
    private Set<Group> groups;
    @OneToMany(targetEntity = UserTmpRole.class, mappedBy = "tmpRoleId.user")
    private Set<UserTmpRole> roles;

    public Set<Role> getRoles() {
        Set<Role> roles = new HashSet<Role>();
        this.roles.forEach(r -> roles.add(r.getTmpRoleId().getRole()));
        this.groups.forEach(g -> roles.addAll(g.getRoles()));

        return roles;
    }

}
