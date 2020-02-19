package br.wosiak.marjbillsapi.converter;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.dto.CategoriaDTO;
import br.wosiak.marjbillsapi.model.Categoria;

@Component
public class CategoriaConverter implements Convertable<Categoria, CategoriaDTO>{

	@Override
	public Categoria convertToModel(CategoriaDTO dto) {
		Categoria model = new Categoria();
		model.setId(dto.getId());
		model.setDescricao(dto.getDescricao());
		return model;
	}

	@Override
	public CategoriaDTO convertToDTO(Categoria model) {
		CategoriaDTO dto = new CategoriaDTO();
		dto.setId(model.getId());
		dto.setDescricao(model.getDescricao());
		return dto;
	}

}
