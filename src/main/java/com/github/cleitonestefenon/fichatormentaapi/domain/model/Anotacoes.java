package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "anotacoes")
public class Anotacoes extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "ano_id", updatable = false, nullable = false)
    private UUID id;

    @Type(type = "text")
    @Column(name = "ano_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "ano_personagem_id")
    private Personagem personagem;

}
