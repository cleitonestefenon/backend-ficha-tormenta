package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import com.github.cleitonestefenon.fichatormentaapi.domain.model.enums.Atributos;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

@Data
@Entity(name = "atributo")
public class Atributo extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "atr_id", updatable = false, nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "atr_descricao")
    private Atributos descricao;

    @OneToMany(mappedBy = "atributo", cascade = CascadeType.ALL)
    private Collection<PersonagemAtributo> personagemAtributos;

}
