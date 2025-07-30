package com.projeto.projetofinal.repository;

import com.projeto.projetofinal.modelos.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}