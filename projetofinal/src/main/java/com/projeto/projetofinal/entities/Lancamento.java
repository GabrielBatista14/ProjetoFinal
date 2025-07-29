package com.projeto.projetofinal.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbLancamento")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String operacao;

    @ManyToOne
    @JoinColumn(name = "contaId", nullable = false)
    private Conta conta;

}
