package com.projeto.projetofinal.entities;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbPessoa")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;
}



