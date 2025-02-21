package io.github.springcloud.msclientes.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.springcloud.msclientes.domain.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {



    @GetMapping
    public String status(){
        return "ok";
    }

    @PostMapping
    public ResponseEntity<Cliente> create(){

    }
}
