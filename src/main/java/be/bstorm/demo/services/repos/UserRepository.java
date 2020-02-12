package be.bstorm.demo.services.repos;

import be.bstorm.demo.models.Group;
import be.bstorm.demo.models.Role;
import be.bstorm.demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import java.util.Set;

@Repository
//@NamedQuery(query = "SELECT u FROM User u", name = "SELECT_ALL")
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT u FROM User u WHERE u.email = :email")
    User findByEmail(@Param("email") String email);

    @Query(value = "SELECT u FROM User u WHERE u.pseudo = :pseudo")
    User findByPseudo(@Param("pseudo") String pseudo);

    @Query(value = "SELECT u FROM User u WHERE :groupe MEMBER OF u.groups")
    Set<User> findByGroup(@Param("groupe") Group r);

}
