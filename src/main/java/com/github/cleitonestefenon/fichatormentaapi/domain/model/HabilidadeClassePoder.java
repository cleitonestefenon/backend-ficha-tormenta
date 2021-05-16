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
@Entity(name = "habilidade_classe_poder")
public class HabilidadeClassePoder extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "hcp_id", updatable = false, nullable = false)
    private UUID id;

    @Type(type = "text")
    @Column(name = "hcp_descricao")
    private String hcp_descricao;

    @ManyToOne
    @JoinColumn(name = "hcp_personagem_id")
    private Personagem personagem;

    @Override
    public boolean isNew() {
        return false;
    }
}
