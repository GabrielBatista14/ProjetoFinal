package com.projeto.projetofinal.modelos.dtos;

import com.projeto.projetofinal.modelos.enums.Perfil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponseDTO {

    private Long id;
    private String cpf;
    private Perfil perfil;
    private Long idPessoa;


    // Construtor, Getters e Setters
}
