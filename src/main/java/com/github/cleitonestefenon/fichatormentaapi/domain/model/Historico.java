package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "historico")
public class Historico extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "his_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "his_personagem_id")
    private Personagem personagem;

    @Type(type = "text")
    @Column(name = "his_descricao")
    private String descricao;
}
