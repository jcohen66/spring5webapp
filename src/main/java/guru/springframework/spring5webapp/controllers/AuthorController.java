package guru.springframework.spring5webapp.controllers;


import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorRepository AuthorRepository;

    public AuthorController(AuthorRepository AuthorRepository) {
        this.AuthorRepository = AuthorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("Authors", AuthorRepository.findAll());

        // Associate with ThymeLeaf view.
        return "authors";
    }
}
