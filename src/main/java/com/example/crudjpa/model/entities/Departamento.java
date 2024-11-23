package com.example.crudjpa.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data // vem do lombok -  cria os gets e sets automicamentes
@NoArgsConstructor // construtor sem parametros
@AllArgsConstructor // construtor com parametros
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDepartamento;

    // Relacionamento OneToMany - Um departamento contém vários funcionários
    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = true)
    // mappedBy: referência ao atributo 'department' na classe Employee
    // cascade: persistir ou excluir um departamento reflete nos funcionários associados
    private List<Funcionario> employees = new ArrayList<>();
}
