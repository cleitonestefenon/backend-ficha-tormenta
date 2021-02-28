package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "habilidade_raca_origem")
public class HabilidadeRacaOrigem extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hro_id")
    private long hro_id;

    @Type(type = "text")
    @Column(name = "hro_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "hro_personagem_id")
    private Personagem personagem;
}
