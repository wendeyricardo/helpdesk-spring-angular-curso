package com.wendey.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendey.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
