package com.projeto.projetofinal.modelos.dtos;

import com.projeto.projetofinal.modelos.enums.Perfil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDTO {

    @NotBlank(message = "CPF é obrigatório")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter 11 dígitos")
    private String cpf;

    @NotBlank(message = "Senha é obrigatória")
    private String senha;

    private Perfil perfil;

    private Long idPessoa;
}
