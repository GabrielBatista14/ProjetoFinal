package com.projeto.projetofinal.modelos.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContaUpdateDTO {
    private String novaChavePix;
    private  double novoLimite;
}
