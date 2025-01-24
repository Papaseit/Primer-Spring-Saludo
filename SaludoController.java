package org.example.pruebaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/Saludo")
    public String saludo() {
        return "Hola, que hay";
    }
}
