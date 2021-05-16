package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "personagem_pericia")
public class PersonagemPericia extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "pep_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "pep_bonus_nivel")
    private int bonusNivel;

    @Column(name = "pep_bonus_outros")
    private int bonusOutros;

    @Column(name = "pep_bonus_treino")
    private int bonusTreino;

    @ManyToOne()
    @JoinColumn(name = "pep_personagem_id")
    private Personagem personagem;

    @ManyToOne()
    @JoinColumn(name = "pep_pericia_id")
    private Pericia pericia;

    @Override
    public UUID getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
