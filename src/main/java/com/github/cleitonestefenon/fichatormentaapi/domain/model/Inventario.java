package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "inventario")
public class Inventario extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "inv_id", updatable = false, nullable = false)
    private UUID id;

    @Type(type = "text")
    @Column(name = "inv_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "inv_personagem_id")
    private Personagem personagem;

}
