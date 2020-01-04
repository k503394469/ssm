package com.liu.controller;

import com.liu.pojo.Item;
import com.liu.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @RequestMapping("/showItem/{id}")
    public String showItem(@PathVariable int id, Model model){
        Item item = itemService.findById(id);
        model.addAttribute("item",item);
        return "showItem";
    }
}
