package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "item")
public class Item extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "ite_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "ite_descricao")
    private String descricao;

    @Column(name = "ite_descricao_magico")
    private String descricaoMagico;

    @ManyToOne
    @JoinColumn(name = "ite_personagem_id")
    private Personagem personagem;

    @Override
    public boolean isNew() {
        return false;
    }
}
