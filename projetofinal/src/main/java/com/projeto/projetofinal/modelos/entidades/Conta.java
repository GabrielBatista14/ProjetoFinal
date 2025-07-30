package com.projeto.projetofinal.modelos.entidades;

import com.projeto.projetofinal.modelos.entidades.Cliente;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbConta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false, unique = true)
    private String chavePix;

    @Column(nullable = false)
    private double saldo;

    @Column(nullable = false)
    private double limiteCredito;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private Cliente cliente;


}
