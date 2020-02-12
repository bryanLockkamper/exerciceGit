package be.bstorm.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_role")
public class UserTmpRole implements Serializable {
    @EmbeddedId
    private ComplexId tmpRoleId;

    private LocalDate startAt;
    private LocalDate endAt;

    @Embeddable
    @Data
    public class ComplexId implements Serializable {
        @ManyToOne(targetEntity = User.class)
        @JoinColumn(name = "user_id")
        private User user;
        @ManyToOne(targetEntity = Role.class)
        @JoinColumn(name = "role_id")
        private Role role;

        public Role getRole() {
            return role;
        }
    }

    public ComplexId getTmpRoleId() {
        return tmpRoleId;
    }
}
