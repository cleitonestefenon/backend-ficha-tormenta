package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity(name = "magia")
public class Magia extends Auditoria implements Persistable<UUID> {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "mag_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "mag_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "mag_personagem_id")
    private Personagem personagem;

    @Override
    public boolean isNew() {
        return false;
    }
}