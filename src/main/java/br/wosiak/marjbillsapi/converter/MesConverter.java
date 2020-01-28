package br.wosiak.marjbillsapi.converter;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.dto.MesDTO;
import br.wosiak.marjbillsapi.model.Mes;

@Component
public class MesConverter implements Convertable<Mes, MesDTO>{

	@Override
	public Mes convertToModel(MesDTO dto) {
		Mes model = new Mes();
		model.setId(dto.getId());
		model.setData(dto.getData());
		model.setUsuario(dto.getUsuario());
		model.setMovimentacoes(dto.getMovimentacoes());
		return model;
	}

	@Override
	public MesDTO convertToDTO(Mes model) {
		MesDTO dto = new MesDTO();
		dto.setId(model.getId());
		dto.setData(model.getData());
		dto.setUsuario(model.getUsuario());
		dto.setMovimentacoes(model.getMovimentacoes());
		return dto;
	}
	

}
