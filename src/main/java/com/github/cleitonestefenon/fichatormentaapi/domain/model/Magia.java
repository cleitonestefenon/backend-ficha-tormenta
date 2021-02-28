package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "magia")
public class Magia extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mag_id")
    private long id;

    @Column(name = "mag_descricao", length = 1000)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "mag_personagem_id")
    private Personagem personagem;
}
