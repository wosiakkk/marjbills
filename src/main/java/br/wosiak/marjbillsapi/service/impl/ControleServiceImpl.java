package br.wosiak.marjbillsapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.ControleConverter;
import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.dto.ControleDTO;
import br.wosiak.marjbillsapi.model.Controle;
import br.wosiak.marjbillsapi.repository.ControleRepository;
import br.wosiak.marjbillsapi.service.ControleService;

@Service
public class ControleServiceImpl extends BasicServiceImpl<ControleDTO, Controle, Long> implements ControleService{

	@Autowired
	private ControleConverter controleConverter;
	@Autowired
	private ControleRepository controleRepository;
	
	@Override
	protected Convertable<Controle, ControleDTO> getConverter() {
		return this.controleConverter;
	}

	@Override
	protected CrudRepository<Controle, Long> getRepository() {
		return this.controleRepository;
	}

}
