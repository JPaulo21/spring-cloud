package io.github.springcloud.mscartoes.web.controller;

import io.github.springcloud.mscartoes.domain.Cartao;
import io.github.springcloud.mscartoes.domain.CartaoService;
import io.github.springcloud.mscartoes.domain.clienteCartao.ClienteCartaoService;
import io.github.springcloud.mscartoes.web.dto.request.CartaoRequest;
import io.github.springcloud.mscartoes.web.dto.response.CartoesPorClienteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
@RequiredArgsConstructor
public class CartoesController {

    private final CartaoService cartaoService;
    private final ClienteCartaoService clienteCartaoService;

    @GetMapping
    public String status(){
        return "ok";
    }

    @PostMapping
    public ResponseEntity<Void> cadastra(@RequestBody CartaoRequest cartaoRequest){
        Cartao cartao = cartaoService.save(cartaoRequest.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(params = "renda")
    public ResponseEntity<List<Cartao>> getRendaAteh(@RequestParam("renda") Long renda){
        List<Cartao> list = cartaoService.getCartoesRendaMenorIgual(renda);
        return ResponseEntity.ok(list);
    }

    @GetMapping(params = "cpf")
    public ResponseEntity<List<CartoesPorClienteResponse>> getCartoesByClienteCpf(@RequestParam("cpf") String cpf){
        List<CartoesPorClienteResponse> cartoes = clienteCartaoService.listarCartoesPorCpf(cpf)
                .stream()
                .map(clienteCartao -> new CartoesPorClienteResponse(clienteCartao.getCartao().getNome(),
                        clienteCartao.getCartao().getBandeira().name(),
                        clienteCartao.getLimite()))
                .toList();
        return ResponseEntity.ok(cartoes);
    }

}
