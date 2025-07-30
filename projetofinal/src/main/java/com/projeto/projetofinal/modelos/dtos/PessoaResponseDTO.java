package com.projeto.projetofinal.modelos.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class PessoaResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

}
