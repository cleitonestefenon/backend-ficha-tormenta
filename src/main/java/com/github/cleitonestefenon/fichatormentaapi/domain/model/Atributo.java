package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import com.github.cleitonestefenon.fichatormentaapi.domain.model.enums.Atributos;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "atributo")
public class Atributo extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "atr_id")
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "atr_descricao")
    private Atributos descricao;
}
