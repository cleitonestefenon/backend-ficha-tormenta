package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "pericia")
public class Pericia extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "per_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "per_atributo_id")
    private Atributo atributo;

    @Column(name = "per_descricao")
    private String descricao;

    @Column(name = "per_treinamento")
    private Boolean treinamento;

    @Column(name = "per_penalidade")
    private Boolean penalidade;
}
