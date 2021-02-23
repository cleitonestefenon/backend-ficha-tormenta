package com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditoria {

    @CreationTimestamp
    @Column(name = "criado_em", nullable = false)
    protected LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column(name = "alterado_em")
    protected LocalDateTime alteradoEm;
}
