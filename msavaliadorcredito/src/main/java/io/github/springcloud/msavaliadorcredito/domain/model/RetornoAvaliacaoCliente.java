package io.github.springcloud.msavaliadorcredito.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class RetornoAvaliacaoCliente {
    List<CartaoAprovado> cartoes;
}
