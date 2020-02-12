package be.bstorm.demo.controllers;

import be.bstorm.demo.services.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public String first() {
        return "login";
    }

    @PostMapping("connexion")
    public String connexion(String login, String password) {
        return userRepository.findByPseudo(login) != null ? "accueil" : "inscription";
    }
}
