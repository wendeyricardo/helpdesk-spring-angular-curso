package com.wendey.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendey.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
