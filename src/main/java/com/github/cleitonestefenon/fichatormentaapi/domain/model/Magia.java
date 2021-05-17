package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "magia")
public class Magia extends Auditoria implements Serializable {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "mag_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "mag_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "mag_personagem_id")
    private Personagem personagem;
}