package br.wosiak.marjbillsapi.converter;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.dto.GastoDTO;
import br.wosiak.marjbillsapi.model.Gasto;

@Component
public class GastoConverter implements Convertable<Gasto, GastoDTO>{

	@Override
	public Gasto convertToModel(GastoDTO dto) {
		Gasto model = new Gasto();
		model.setId(dto.getId());
		model.setDescricao(dto.getDescricao());
		model.setValor(dto.getValor());
		model.setFixo(dto.isFixo());
		model.setDataCriacao(dto.getDataCriacao());
		model.setMes(dto.getMes());
		model.setAno(dto.getAno());
		model.setCategoria(dto.getCategoria());
		model.setUsuario(dto.getUsuario());		
		return model;
	}

	@Override
	public GastoDTO convertToDTO(Gasto model) {
		GastoDTO dto = new GastoDTO();
		dto.setId(model.getId());
		dto.setDescricao(model.getDescricao());
		dto.setValor(model.getValor());
		dto.setFixo(model.isFixo());
		dto.setDataCriacao(model.getDataCriacao());
		dto.setMes(model.getMes());
		dto.setAno(model.getAno());
		dto.setCategoria(model.getCategoria());
		dto.setUsuario(model.getUsuario());
		return dto;
	}
	

}
