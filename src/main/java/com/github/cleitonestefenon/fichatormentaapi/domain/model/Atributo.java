package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import com.github.cleitonestefenon.fichatormentaapi.domain.model.enums.Atributos;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

@Data
@Entity
@Table(name = "atributo")
public class Atributo extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "atr_id", updatable = false, nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "atr_descricao")
    private Atributos descricao;

    @OneToMany(mappedBy = "atributo", cascade = CascadeType.ALL)
    private Collection<PersonagemAtributo> personagemAtributos;

    @Override
    public boolean isNew() {
        return false;
    }
}
