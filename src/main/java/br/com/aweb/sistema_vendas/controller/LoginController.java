package br.com.aweb.sistema_vendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "redirect:/pedidos";
    }

    // O POST /login é processado pelo Spring Security
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // O POST /logout é processado pelo Spring Security
    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }
}
