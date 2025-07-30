package com.projeto.projetofinal.repository;

import com.projeto.projetofinal.modelos.autenticacao.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByCpf(String cpf);
    boolean existsByCpf(String cpf);

}
