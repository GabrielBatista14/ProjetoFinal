package com.projeto.projetofinal.modelos.entidades;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tbHistorico")
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dataAcesso;

    @Column(nullable = true)//trocar depois
    private String ipAcesso;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private Pessoa cliente;

}
