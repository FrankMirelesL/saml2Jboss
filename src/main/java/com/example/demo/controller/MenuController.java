package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MenuDTO;

@RestController
public class MenuController {

    @GetMapping("/api/menu")
    public List<MenuDTO> getMenu() {
        return List.of(
            new MenuDTO(1000L, "Administración", null, null, -1L, true, List.of(
                new MenuDTO(1001L, "Candado Poliza Nomina", null, "polizaNominaConsulta", 1000L, true, null),
                new MenuDTO(1100L, "Usuarios", null, "users", 1000L, true, List.of(
                    new MenuDTO(1110L, "Crear Usuario", null, "userInsertForm", 1100L, true, null)
                )),
                new MenuDTO(1200L, "Perfiles", null, "profiles", 1000L, true, List.of(
                    new MenuDTO(1210L, "Crear Perfil", null, "profileInsertForm", 1200L, true, null)
                )),
                new MenuDTO(1400L, "Restaura Proceso Global", null, "restauraProcesoGlobal", 1000L, true, null)
            ))
        );
    }
}