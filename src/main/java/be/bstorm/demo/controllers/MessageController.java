package be.bstorm.demo.controllers;

import be.bstorm.demo.models.Message;
import be.bstorm.demo.services.repos.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping(value = {"/", ""})
    public Set<Message> list() {
        return repository.findAll();
    }

}
