package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "pessoa")
public class Pessoa extends Auditoria implements Persistable<UUID> {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "pes_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "pes_nome", nullable = false)
    private String nome;

    @Column(name = "pes_email", unique = true, nullable = false)
    private String email;

    @Column(name = "pes_senha", nullable = false)
    private String senha;

    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Personagem> personagens;

    @Override
    public boolean isNew() {
        return false;
    }
}
