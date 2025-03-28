package io.github.springcloud.msclientes.domain;

import io.github.springcloud.msclientes.web.dto.response.ClienteResponse;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cliente")
@NoArgsConstructor
@Data
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cpf;
    @Column
    private String nome;
    @Column
    private Integer idade;

    public Cliente(String cpf, String nome, Integer idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public ClienteResponse toDto() {
        return new ClienteResponse(this.id, this.cpf, this.nome, this.idade);
    }
}
