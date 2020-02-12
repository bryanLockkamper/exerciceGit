package be.bstorm.demo.services.repos;

import be.bstorm.demo.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    public Set<Message> findAll();

}
