package io.github.springcloud.msclientes.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {

    private Long id;
    private String cpf;
    private String nome;
    private Integer idade;
}
