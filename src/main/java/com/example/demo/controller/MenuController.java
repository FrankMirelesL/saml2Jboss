package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MenuDTO;

@Controller
public class MenuController {

    @GetMapping("/mainpage")
    public String renderMenuPage(Model model) {
        List<MenuDTO> menu = List.of(
            new MenuDTO(1000L, "Administración", null, null, -1L, true, List.of(
                new MenuDTO(1001L, "Candado Poliza Nomina", null, "polizaNominaConsulta", 1000L, true, null),
                new MenuDTO(1100L, "Usuarios", null, "users", 1000L, true, List.of(
                    new MenuDTO(1110L, "Crear Usuario", null, "userInsertForm", 1100L, true, null)
                )))));
        model.addAttribute("menuData", menu);
        return "mainpage";
    }
}