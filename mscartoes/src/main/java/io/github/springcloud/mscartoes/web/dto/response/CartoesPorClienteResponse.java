package io.github.springcloud.mscartoes.web.dto.response;

import java.math.BigDecimal;

public record CartoesPorClienteResponse(
      String nome,
      String bandeira,
      BigDecimal limiteLiberado
) {
}
