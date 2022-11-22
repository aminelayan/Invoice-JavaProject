package com.javaproject.Controller;

import com.javaproject.Models.Item;
import com.javaproject.Models.User;
import com.javaproject.Services.ItemService;
import com.javaproject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@PreAuthorize("hasAuthority('ROLE_ADMIN')")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private UserService userService;

    @GetMapping("/items")
    public String showAllItems(Model model, Principal principal){
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        List <Item> allitems=itemService.findAll();
        model.addAttribute("allItems",allitems);
        return "items.jsp";
    }

    @GetMapping("/items/new")
    public String createItemPage(@ModelAttribute("newItem") Item newItem) {
        return "createItem.jsp";
    }

    @PostMapping("/items/new")
    public String createItem(@Valid @ModelAttribute("newItem") Item newItem, BindingResult result) {
        if (result.hasErrors()) {
            return "createItem.jsp";
        }
        itemService.createItem(newItem);
        return "redirect:/items";
    }
    @GetMapping("/items/{id}")
    public String previewItem(Model model ,@PathVariable("id") Long id){
        Item thisItem = itemService.findItem(id);
        model.addAttribute("item",thisItem);
        return "showItem.jsp";
    }
    @GetMapping("/items/{id}/edit")
    public String editPage(@Valid @ModelAttribute("editItem")Item item,@PathVariable("id") Long id){
        return "editItem.jsp";
    }
    @PutMapping("/items/{id}/edit")
    public String editItem(@Valid @PathVariable("id") Long id,@ModelAttribute("editItem") Item item ,BindingResult result){
        if(result.hasErrors()) {
            return "editTeam.jsp";
        }
        Item thisItem = itemService.findItem(id);
        itemService.editItem(item);
        return "redirect:/items";
    }
    @GetMapping("/items/{id}/delete")
    public String deleteItem(@PathVariable("id")Long id){
        itemService.deleteItem(id);
        return "redirect:/items";
    }

}

