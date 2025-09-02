package simon.springframework.spring_35._webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import simon.springframework.spring_35._webapp.services.AuthorService;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors",authorService.findAll());
        return "authors";
    }
}
