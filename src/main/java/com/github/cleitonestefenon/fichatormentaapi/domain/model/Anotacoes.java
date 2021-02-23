package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "anotacoes")
public class Anotacoes extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ano_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "ano_personagem_id")
    private Personagem personagem;

    @Type(type = "text")
    @Column(name = "ano_descricao")
    private String descricao;
}
