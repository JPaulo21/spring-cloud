package io.github.springcloud.msavaliadorcredito.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes-credito")
public class AvaliadorCreditoController {

    @GetMapping
    public String status(){
        return "ok";
    }
}
