package io.github.springcloud.msavaliadorcredito.domain;

import io.github.springcloud.msavaliadorcredito.domain.model.CartaoCliente;
import io.github.springcloud.msavaliadorcredito.domain.model.DadosCliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SituacaoCliente {
    private DadosCliente cliente;
    private List<CartaoCliente> cartoes;
}
