package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "habilidade_classe_poder")
public class HabilidadeClassePoder extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hcp_id")
    private long id;

    @Type(type = "text")
    @Column(name = "hcp_descricao")
    private String hcp_descricao;

    @ManyToOne
    @JoinColumn(name = "hcp_personagem_id")
    private Personagem personagem;
}
