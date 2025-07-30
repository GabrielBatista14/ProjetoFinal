package com.projeto.projetofinal.repository;

import com.projeto.projetofinal.modelos.entidades.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}