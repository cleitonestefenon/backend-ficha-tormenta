package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "habilidade_raca_origem")
public class HabilidadeRacaOrigem extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "hro_id", updatable = false, nullable = false)
    private UUID hro_id;

    @Type(type = "text")
    @Column(name = "hro_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "hro_personagem_id")
    private Personagem personagem;

    @Override
    public UUID getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
