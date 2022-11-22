package com.javaproject.Controller;

import com.javaproject.Models.Invoice;
import com.javaproject.Models.Item;
import com.javaproject.Models.User;
import com.javaproject.Services.InvoiceService;
import com.javaproject.Services.ItemService;
import com.javaproject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private UserService userService;

    @Autowired
    private ItemService itemService;

    @GetMapping("/invoices")
    public String showAllInvoices(Model model, Principal principal){
        String username = principal.getName();
        User user= userService.findByUsername(username);
        model.addAttribute("currentUser", userService.findByUsername(username));
        List<Invoice> allInvoices=invoiceService.findAll();
        model.addAttribute("allInvoices",allInvoices);
        if(user.getRoles().equals("ROLE_USER")){
            List<Invoice> allInvoicesForUser = invoiceService.findAllInvoiceByID(user.getId());
            model.addAttribute("allInvoicesForUser",allInvoicesForUser);
        }
        return "invoices.jsp";
    }

    @GetMapping ("/invoices/new")
    public String createPage(@ModelAttribute("newInvoices")Invoice invoice,Model model,Principal principal){
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        List<Item> allTheItem = itemService.findAll();
        model.addAttribute("item",allTheItem);
        return "createInvoice.jsp";
    }
    @PostMapping("/invoices/new")
    public String createInvoice(@Valid @ModelAttribute("newInvoices")Invoice invoice, BindingResult result,Principal principal){
        String username = principal.getName();
        User user=userService.findByUsername(username);
        invoice.setUser(user);
//        invoice.setNote("Hi");
        invoiceService.createInvoice(invoice);
        return "redirect:/invoices";
    }
    @GetMapping("/invoices/{id}")
    public String viewInvoice(Model model, @PathVariable("id")Long id){
        Invoice invoice=invoiceService.findInvoice(id);
        model.addAttribute("invoice",invoice);
        return "showInvoice.jsp";
    }


}
