package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "proeficiencia")
public class Proeficiencia extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "pro_id")
    private UUID pro_id;

    @Type(type = "text")
    @Column(name = "pro_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "pro_personagem_id")
    private Personagem personagem;
}
