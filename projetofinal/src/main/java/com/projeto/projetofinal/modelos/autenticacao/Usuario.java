package com.projeto.projetofinal.modelos.autenticacao;
import com.projeto.projetofinal.modelos.entidades.Pessoa;
import com.projeto.projetofinal.modelos.enums.Perfil;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbUsuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String cpf;

    private String senha;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    @OneToOne
    @JoinColumn(name = "pessoaId")
    private Pessoa pessoa;

}

