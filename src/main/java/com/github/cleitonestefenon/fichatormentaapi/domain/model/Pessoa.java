package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity(name = "pessoa")
public class Pessoa extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pes_id")
    private long id;

    @Column(name = "pes_nome", nullable = false)
    private String nome;

    @Column(name = "pes_email", unique = true, nullable = false)
    private String email;

    @Column(name = "pes_senha", nullable = false)
    private String senha;

    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY)
    private List<Personagem> personagens;
}
