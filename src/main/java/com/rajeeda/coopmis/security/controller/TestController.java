package com.rajeeda.coopmis.security.controller;

import com.rajeeda.coopmis.security.model.Project;
import com.rajeeda.coopmis.security.model.User;
import com.rajeeda.coopmis.security.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.security.RolesAllowed;
import java.util.Optional;


@Controller
public class TestController {

    @Autowired
    private ProjectRepository projectRepository;

    @RolesAllowed({"USER"})
    @GetMapping("/test")
    public String testRole(Model model){

        model.addAttribute("user", User.builder().build());
        return "test";
    }

    public String testStrings(){

        Project project = new Project();
        project.setName("ffooobar", "en");
        projectRepository.save(project);

        Project project2 = new Project();
        project2.setName("spanish", "es");
        projectRepository.save(project2);

        //Optional<Project> project = projectRepository.findById(Long.parseLong("10"));

        System.out.println("project name in english " + project.getName("en"));

        return "test";
    }
}
