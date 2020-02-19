package br.wosiak.marjbillsapi.converter;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.dto.ControleDTO;
import br.wosiak.marjbillsapi.model.Controle;

@Component
public class ControleConverter implements Convertable<Controle, ControleDTO> {

	@Override
	public Controle convertToModel(ControleDTO dto) {
		Controle model = new Controle();
		model.setId(dto.getId());
		model.setAno(dto.getAno());
		model.setDescricao(dto.getDescricao());
		model.setUsuario(dto.getUsuario());
		model.setMeses(dto.getMeses());
		return model;
	}

	@Override
	public ControleDTO convertToDTO(Controle model) {
		ControleDTO dto = new ControleDTO();
		dto.setId(model.getId());
		dto.setAno(model.getAno());
		dto.setDescricao(model.getDescricao());
		dto.setUsuario(model.getUsuario());
		dto.setMeses(model.getMeses());
		return dto;
	}

}
