package com.wendey.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendey.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
