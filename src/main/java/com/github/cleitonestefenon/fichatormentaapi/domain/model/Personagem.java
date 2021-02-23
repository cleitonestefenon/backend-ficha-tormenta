package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "personagem")
public class Personagem extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "per_id")
    private long id;

    @Column(name = "per_nome")
    private String nome;

    @Column(name = "per_raca")
    private String raca;

    @Column(name = "per_origem")
    private String origem;

    @Column(name = "per_classe")
    private String classe;

    @Column(name = "per_nivel")
    private int nivel;

    @Column(name = "per_divindade")
    private String divindade;

    @Column(name = "per_vida_total")
    private int vidaTotal;

    @Column(name = "per_mana_total")
    private int manaTotal;

    @Column(name = "per_vida_atual")
    private int vidaAtual;

    @Column(name = "per_mana_atual")
    private int manaAtual;

    @Column(name = "per_deslocamento")
    private int deslocamento;

    @Column(name = "per_pontos_exp")
    private int pontosExperiencia;

    @ManyToOne
    @JoinColumn(name = "per_pessoa_id")
    private Pessoa pessoa;
}
