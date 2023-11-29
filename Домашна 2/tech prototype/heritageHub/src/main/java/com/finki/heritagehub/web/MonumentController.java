package com.finki.heritagehub.web;

import com.finki.heritagehub.model.Monument;
import com.finki.heritagehub.service.MonumentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MonumentController {
    private final MonumentService monumentService;

    public MonumentController(MonumentService monumentService) {
        this.monumentService = monumentService;
    }

    @GetMapping("/")
    public String showCategories() {
        return "categories";
    }

    @GetMapping("/category/{category}")
    public String showMonumentsByCategory(@PathVariable String category, Model model) {
        List<Monument> monuments = monumentService.getAllMonumentsByCategory(category);
        model.addAttribute("monuments", monuments);
        return "monuments";
    }

    @GetMapping("/monument/{id}")
    public String showMonumentDetails(@PathVariable Long id, Model model) {
        Monument monument = monumentService.getMonumentById(id);
        model.addAttribute("monument", monument);
        return "monumentDetails";
    }
}