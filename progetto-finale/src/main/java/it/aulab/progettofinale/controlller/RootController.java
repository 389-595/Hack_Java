package it.aulab.progettofinale.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class RootController {
    
    @GetMapping("/")
    public String root(Model model) {
        model.addAttribute("title", "Learning Platform");
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        model.addAttribute("title", "Login to Learning Platform");
        return "login";
    }
}
