package br.wosiak.marjbillsapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.ControleConverter;
import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.dto.ControleDTO;
import br.wosiak.marjbillsapi.model.Controle;
import br.wosiak.marjbillsapi.model.Mes;
import br.wosiak.marjbillsapi.repository.ControleRepository;
import br.wosiak.marjbillsapi.repository.MesRepository;
import br.wosiak.marjbillsapi.service.ControleService;
import br.wosiak.marjbillsapi.service.exception.ServiceException;
import br.wosiak.marjbillsapi.utils.ControleAnual;

@Service
public class ControleServiceImpl extends BasicServiceImpl<ControleDTO, Controle, Long> implements ControleService{

	@Autowired
	private ControleConverter controleConverter;
	@Autowired
	private ControleRepository controleRepository;
	@Autowired
	private MesRepository mesRepository;
	@Autowired
	private ControleAnual controleAnual;
	
	@Override
	protected Convertable<Controle, ControleDTO> getConverter() {
		return this.controleConverter;
	}

	@Override
	protected CrudRepository<Controle, Long> getRepository() {
		return this.controleRepository;
	}

	@Override
	public ControleDTO salvar(ControleDTO dto) throws ServiceException {
		ControleDTO salvo = super.salvar(dto);
		List<Mes> meses = controleAnual.gerarAnoCompleto(controleConverter.convertToModel(salvo));
		for (Mes mes : meses) {
			mesRepository.save(mes);
		}
		salvo.setMeses(meses);
		return super.update(salvo);
	}
}
