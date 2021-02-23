package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "defesa")
public class Defesa extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "def_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "def_personagem_id")
    private Personagem personagem;

    @Column(name = "def_total")
    private int total;

    @Column(name = "def_modificador")
    private int modificador;

    @Column(name = "def_bonus_armadura")
    private int bonusArmadura;

    @Column(name = "def_bonus_outros")
    private int bonusOutros;

    @Column(name = "def_bonus_escudo")
    private int bonusEscudo;
}
