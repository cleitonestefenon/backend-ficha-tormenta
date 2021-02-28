package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "personagem_pericia")
public class PersonagemPericia extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pep_id")
    private long pep_id;

    @JoinColumn(name = "pep_personagem_id")
    private Personagem personagem;

    @JoinColumn(name = "pep_pericia_id")
    private Pericia pericia;

    @Column(name = "pep_bonus_nivel")
    private int bonusNivel;

    @Column(name = "pep_bonus_outros")
    private int bonusOutros;

    @Column(name = "pep_bonus_treino")
    private int bonusTreino;
}
