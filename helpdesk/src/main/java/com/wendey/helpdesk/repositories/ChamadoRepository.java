package com.wendey.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendey.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
