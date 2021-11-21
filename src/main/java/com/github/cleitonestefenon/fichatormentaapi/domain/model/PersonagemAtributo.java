package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "personagem_atributo")
public class PersonagemAtributo extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "pea_id")
    private UUID id;

    @JoinColumn(name = "pea_personagem_id")
    private Personagem personagem;

    @JoinColumn(name = "pea_atributo_id")
    private Atributo atributo;

    @Column(name = "pea_total")
    private int total;

    @Column(name = "pea_modificador")
    private int modificador;
}
