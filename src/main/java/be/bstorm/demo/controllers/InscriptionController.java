package be.bstorm.demo.controllers;

import be.bstorm.demo.models.User;
import be.bstorm.demo.services.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inscription")
public class InscriptionController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public String first() {
        return "inscription";
    }

    @PostMapping("")
    public String connexion(String login, String email, String password) {
        if (userRepository.findByPseudo(login) == null) {
            User user = new User();
            user.setEmail(email);
            user.setPseudo(login);
            userRepository.save(user);
            return "accueil";
        }
        return "inscription";
    }
}
