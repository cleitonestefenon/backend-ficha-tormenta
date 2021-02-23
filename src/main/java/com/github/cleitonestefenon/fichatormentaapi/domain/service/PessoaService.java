package com.github.cleitonestefenon.fichatormentaapi.domain.service;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.Pessoa;
import com.github.cleitonestefenon.fichatormentaapi.domain.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

}
