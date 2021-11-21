package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "item")
public class Item extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "ite_id")
    private UUID id;

    @Column(name = "ite_descricao")
    private String descricao;

    @Column(name = "ite_descricao_magico")
    private String descricaoMagico;

    @ManyToOne
    @JoinColumn(name = "ite_personagem_id")
    private Personagem personagem;
}
