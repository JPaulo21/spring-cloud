package io.github.springcloud.msclientes.web.controller;

import io.github.springcloud.msclientes.domain.Cliente;
import io.github.springcloud.msclientes.domain.ClienteService;
import io.github.springcloud.msclientes.web.dto.request.ClienteRequest;
import io.github.springcloud.msclientes.web.dto.response.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    public String status(){
        log.info("Obtendo status do microservice de clientes");
        return "ok";
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody ClienteRequest clienteRequest){
        Cliente cliente = clienteService.save(clienteRequest.toEntity());
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(cliente.getCpf())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(params = "cpf")
    public ResponseEntity<ClienteResponse> getClienteByCpf(@RequestParam("cpf") String cpf){
        var cliente = clienteService.getByCpf(cpf);
        return cliente.map(clienteModel -> ResponseEntity.ok(clienteModel.toDto()))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
