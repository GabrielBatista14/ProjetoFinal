package com.projeto.projetofinal.modelos.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PessoaRequestDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
