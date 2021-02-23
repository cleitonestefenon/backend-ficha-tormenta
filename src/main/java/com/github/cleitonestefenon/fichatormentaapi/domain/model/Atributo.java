package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import com.github.cleitonestefenon.fichatormentaapi.domain.model.enums.Atributos;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "atributo")
public class Atributo extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "atr_id")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "atr_descricao")
    private Atributos descricao;
}
