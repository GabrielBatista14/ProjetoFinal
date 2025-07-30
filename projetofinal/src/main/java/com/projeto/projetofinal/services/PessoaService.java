package com.projeto.projetofinal.services;


import java.util.List;
import java.util.stream.Collectors;

import com.projeto.projetofinal.dtos.PessoaResponseDTO;
import com.projeto.projetofinal.modelos.entidades.Pessoa;
import com.projeto.projetofinal.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import jakarta.persistence.EntityNotFoundException;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaResponseDTO> findAll() {
        List<Pessoa> listaPessoa = pessoaRepository.findAll();
        return listaPessoa.stream().map(PessoaResponseDTO::new).toList();
    }


}

