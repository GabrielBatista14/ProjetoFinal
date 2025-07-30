package com.projeto.projetofinal.repository;

import com.projeto.projetofinal.modelos.entidades.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

    boolean existsByPix(String chavePix);
}