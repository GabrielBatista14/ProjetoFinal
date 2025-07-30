package com.projeto.projetofinal.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoDTO {

    private Long id;
    private LocalDateTime dataAcesso;
    private String ipAcesso;

}

