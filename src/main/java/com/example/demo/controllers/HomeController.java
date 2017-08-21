package com.example.demo.controllers;

import com.example.demo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormpage(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFormPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song" , song);
        return "confirmsong";
    }

}
