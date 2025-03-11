package io.github.springcloud.mscartoes.web.controller;

import io.github.springcloud.mscartoes.domain.Cartao;
import io.github.springcloud.mscartoes.domain.CartaoService;
import io.github.springcloud.mscartoes.web.dto.request.CartaoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cartoes")
@RequiredArgsConstructor
public class CartoesController {

    private final CartaoService cartaoService;

    @GetMapping
    public String status(){
        return "ok";
    }

    @PostMapping
    public ResponseEntity<Void> cadastra(@RequestBody CartaoRequest cartaoRequest){
        Cartao cartao = cartaoService.save(cartaoRequest.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
