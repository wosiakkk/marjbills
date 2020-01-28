package br.wosiak.marjbillsapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.converter.MesConverter;
import br.wosiak.marjbillsapi.dto.MesDTO;
import br.wosiak.marjbillsapi.model.Mes;
import br.wosiak.marjbillsapi.repository.MesRepository;
import br.wosiak.marjbillsapi.service.MesService;

@Service
public class MesServiceImpl extends BasicServiceImpl<MesDTO, Mes, Long> implements MesService{

	@Autowired
	private MesConverter mesConverter;
	@Autowired
	private MesRepository mesRepository;
	
	@Override
	protected Convertable<Mes, MesDTO> getConverter() {
		return mesConverter;
	}

	@Override
	protected CrudRepository<Mes, Long> getRepository() {
		return mesRepository;
	}

	
	
}
