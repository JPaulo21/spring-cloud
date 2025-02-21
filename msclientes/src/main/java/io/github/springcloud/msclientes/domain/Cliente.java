package io.github.springcloud.msclientes.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "")
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
}
