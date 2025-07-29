package com.projeto.projetofinal.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tbPessoa")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    String cpf;


}
