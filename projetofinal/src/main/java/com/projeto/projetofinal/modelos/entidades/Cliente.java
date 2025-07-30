package com.projeto.projetofinal.modelos.entidades;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbHist")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;
}
