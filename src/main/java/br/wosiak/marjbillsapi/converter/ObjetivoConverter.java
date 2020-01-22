package br.wosiak.marjbillsapi.converter;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.dto.ObjetivoDTO;
import br.wosiak.marjbillsapi.model.Objetivo;

@Component
public class ObjetivoConverter implements Convertable<Objetivo, ObjetivoDTO>{

	@Override
	public Objetivo convertToModel(ObjetivoDTO dto) {
		Objetivo model = new Objetivo();
		model.setId(dto.getId());
		model.setDescricao(dto.getDescricao());
		model.setValor(dto.getValor());
		model.setSucesso(dto.isSucesso());
		model.setDataInicio(dto.getDataInicio());
		model.setDataFim(dto.getDataFim());
		return model;
	}

	@Override
	public ObjetivoDTO convertToDTO(Objetivo model) {
		ObjetivoDTO dto = new ObjetivoDTO();
		dto.setId(model.getId());
		dto.setDescricao(model.getDescricao());
		dto.setValor(model.getValor());
		dto.setSucesso(model.isSucesso());
		dto.setDataInicio(model.getDataInicio());
		dto.setDataFim(model.getDataFim());
		return dto;
	}

	
	
}
