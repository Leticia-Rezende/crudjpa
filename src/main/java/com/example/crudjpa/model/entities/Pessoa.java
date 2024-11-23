package com.example.crudjpa.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // vem do lombok -  cria os gets e sets automicamentes
@NoArgsConstructor // construtor sem parametros
@AllArgsConstructor // construtor com parametros
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;

    // Relacionamento OneToOne com a classe Passport
    @OneToOne(cascade = CascadeType.ALL) // Cascata: alterações em Person serão refletidas no Passaporte
    //@JoinColumn(name = "passport_id", referencedColumnName = "id") // Nome da coluna que referencia a chave estrangeira
    private Passaporte passport;
}
