package com.example.crudjpa.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // vem do lombok -  cria os gets e sets automicamentes
@NoArgsConstructor // construtor sem parametros
@AllArgsConstructor // construtor com parametros
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeFuncionario;

    // Relacionamento ManyToOne - Vários funcionários pertencem a um único departamento
    @ManyToOne
    //@JoinColumn(name = "departamento_id") // Define a coluna de chave estrangeira
    private Departamento departamento;
}
