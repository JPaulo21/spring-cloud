package io.github.springcloud.msclientes.web.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.br.CPF;

public record ClienteRequest(
        @CPF
        String cpf,
        @NotNull
        String nome,
        @PositiveOrZero
        Integer idade
) {
}
