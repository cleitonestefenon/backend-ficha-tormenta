package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "personagem_atributo")
public class PersonagemAtributo extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "pea_id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "pea_personagem_id")
    private Personagem personagem;

    @ManyToOne()
    @JoinColumn(name = "pea_atributo_id")
    private Atributo atributo;

    @Column(name = "pea_total")
    private int total;

    @Column(name = "pea_modificador")
    private int modificador;

}
