package io.github.springcloud.msavaliadorcredito.domain.clients;

import io.github.springcloud.msavaliadorcredito.domain.model.Cartao;
import io.github.springcloud.msavaliadorcredito.domain.model.CartaoCliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "mscartoes", path = "/cartoes")
public interface CartoesControllerClient {

    @GetMapping(params = "cpf")
    ResponseEntity<List<CartaoCliente>> getCartoesByClienteCpf(@RequestParam("cpf") String cpf);

    @GetMapping(params = "renda")
    public ResponseEntity<List<Cartao>> getRendaAteh(@RequestParam("renda") Long renda);
}
