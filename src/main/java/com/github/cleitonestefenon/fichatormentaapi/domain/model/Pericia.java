package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

@Data
@Entity(name = "pericia")
public class Pericia extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "per_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "per_descricao")
    private String descricao;

    @Column(name = "per_treinamento")
    private Boolean treinamento;

    @Column(name = "per_penalidade")
    private Boolean penalidade;

    @OneToMany(mappedBy = "pericia", cascade = CascadeType.ALL)
    private Collection<PersonagemPericia> personagemPericia;

    @ManyToOne
    @JoinColumn(name = "per_atributo_id")
    private Atributo atributo;

}
