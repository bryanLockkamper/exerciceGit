package be.bstorm.demo.controllers;

import be.bstorm.demo.models.User;
import be.bstorm.demo.services.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private EntityManager manager;

    @Autowired
    private UserRepository repository;

    @GetMapping(value = {"/", ""})
    public ResponseEntity<List<User>> list() {
        Query q = manager.createNamedQuery("SELECT_ALL"); // ajout sur le model ?
        // si params
        // q.setParameter();
        return new ResponseEntity(q.getResultList(), HttpStatus.OK);

        //return "Hello there !";
    }

    @PostMapping("/add")
    public ResponseEntity<User> add(@RequestBody User user) {
        System.out.println(user);
//        repository.
        return new ResponseEntity<>(repository.save(user), HttpStatus.OK);
    }

}
