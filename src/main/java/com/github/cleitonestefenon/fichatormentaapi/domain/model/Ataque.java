package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "ataque")
public class Ataque extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ata_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "ata_personagem_id")
    private Personagem personagem;

    @Column(name = "ata_descricao")
    private String descricao;

    @Column(name = "ata_teste_ataque")
    private int testeAtaque;

    @Column(name = "ata_dano")
    private String dano;

    @Column(name = "ata_critico")
    private String critico;

    @Column(name = "ata_tipo_dano")
    private String tipoDano;

    @Column(name = "ata_alcance")
    private String alcance;
}
