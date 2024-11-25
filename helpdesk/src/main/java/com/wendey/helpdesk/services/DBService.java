package com.wendey.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendey.helpdesk.domain.Chamado;
import com.wendey.helpdesk.domain.Cliente;
import com.wendey.helpdesk.domain.Tecnico;
import com.wendey.helpdesk.domain.enums.Perfil;
import com.wendey.helpdesk.domain.enums.Prioridade;
import com.wendey.helpdesk.domain.enums.Status;
import com.wendey.helpdesk.repositories.ChamadoRepository;
import com.wendey.helpdesk.repositories.ClienteRepository;
import com.wendey.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Wendey Ricardo", "01714471071", "wendeyricardo@mail", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Steve jobs", "44710710171", "sjobs@mail.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	

	}
}
