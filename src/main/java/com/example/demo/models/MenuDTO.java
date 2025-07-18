package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class MenuDTO {
    private Long id;
    private String name;
    private String description;
    private String action;
    private Long parentId;
    private boolean isDisplayable;
    private List<MenuDTO> menuItems;
}