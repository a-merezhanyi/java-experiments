package com.example.demo;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamMateController {

    private final TeamMateRepository repository;

    public TeamMateController(TeamMateRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public String index(Model model) {
        List<TeamMate> list = repository.findAll();
        System.out.print(">>>");
        System.out.print(list.toString());
        model.addAttribute("teammates", list);
        return list.toString();
    }
}
