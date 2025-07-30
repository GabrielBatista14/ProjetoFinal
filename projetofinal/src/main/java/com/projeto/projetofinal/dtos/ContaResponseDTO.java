package com.projeto.projetofinal.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContaResponseDTO {
    private Long id;
    private String numero;
    private String chavePix;
    private double saldo;
    private double limiteCredito;
    private Long clienteId;
    private String nomeCliente; // útil para exibir no front
}
