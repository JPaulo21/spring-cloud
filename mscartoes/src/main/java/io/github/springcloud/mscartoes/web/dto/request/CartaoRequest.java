package io.github.springcloud.mscartoes.web.dto.request;

import io.github.springcloud.mscartoes.domain.Cartao;
import io.github.springcloud.mscartoes.domain.enums.BandeiraCartao;

import java.math.BigDecimal;

public record CartaoRequest(
        String nome,
        BandeiraCartao bandeira,
        BigDecimal renda,
        BigDecimal limite
) {
    public Cartao toEntity() {
        return Cartao.builder()
                    .nome(nome)
                    .bandeira(bandeira)
                    .renda(renda)
                    .limiteBasico(limite)
                .build();
    }
}
