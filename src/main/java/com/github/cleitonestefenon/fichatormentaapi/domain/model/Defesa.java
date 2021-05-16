package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "defesa")
public class Defesa extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "def_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "def_total")
    private int total;

    @Column(name = "def_modificador")
    private int modificador;

    @Column(name = "def_bonus_armadura")
    private int bonusArmadura;

    @Column(name = "def_bonus_outros")
    private int bonusOutros;

    @Column(name = "def_bonus_escudo")
    private int bonusEscudo;

    @ManyToOne
    @JoinColumn(name = "def_personagem_id")
    private Personagem personagem;

    @Override
    public boolean isNew() {
        return false;
    }
}
