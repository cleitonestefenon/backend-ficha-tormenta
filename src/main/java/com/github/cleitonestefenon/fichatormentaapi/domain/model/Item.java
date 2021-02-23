package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "item")
public class Item extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ite_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "ite_personagem_id")
    private Personagem personagem;

    @Column(name = "ite_descricao")
    private String descricao;

    @Column(name = "ite_descricao_magico")
    private String descricaoMagico;
}
