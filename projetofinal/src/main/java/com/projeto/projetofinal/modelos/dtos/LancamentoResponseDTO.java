package com.projeto.projetofinal.modelos.dtos;


import com.projeto.projetofinal.modelos.enums.TipoLancamento;
import com.projeto.projetofinal.modelos.enums.TipoOperacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LancamentoResponseDTO {

    private Long id;
    private double valor;
    private TipoLancamento tipo;
    private TipoOperacao operacao;
    private Long contaId;


}
