package com.projeto.projetofinal.dtos;

import com.projeto.projetofinal.modelos.entidades.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class PessoaResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

    public PessoaResponseDTO(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.telefone = pessoa.getTelefone();
    }


}
