package com.example.crudjpa.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // vem do lombok -  cria os gets e sets automicamentes
@NoArgsConstructor // construtor sem parametros
@AllArgsConstructor // construtor com parametros
public class Passaporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String numeroPassaperte;
}
