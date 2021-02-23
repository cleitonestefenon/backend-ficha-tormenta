package com.github.cleitonestefenon.fichatormentaapi.domain.repository;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
