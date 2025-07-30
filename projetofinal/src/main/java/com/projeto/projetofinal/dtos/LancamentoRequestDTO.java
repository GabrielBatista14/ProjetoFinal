package com.projeto.projetofinal.dtos;

import com.projeto.projetofinal.modelos.enums.TipoLancamento;
import com.projeto.projetofinal.modelos.enums.TipoOperacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LancamentoRequestDTO {

    private double valor;
    private TipoLancamento tipo;
    private TipoOperacao operacao;
    private Long idConta;



}
