package br.wosiak.marjbillsapi.converter;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.dto.MovimentacaoDTO;
import br.wosiak.marjbillsapi.model.Movimentacao;

@Component
public class MovimentacaoConverter implements Convertable<Movimentacao, MovimentacaoDTO>{

	@Override
	public Movimentacao convertToModel(MovimentacaoDTO dto) {
		Movimentacao model = new Movimentacao();
		model.setId(dto.getId());
		model.setDescricao(dto.getDescricao());
		model.setValor(dto.getValor());
		model.setFixo(dto.isFixo());
		model.setDataCriacao(dto.getDataCriacao());
		model.setMes(dto.getMes());
		model.setAno(dto.getAno());
		model.setCategoria(dto.getCategoria());
		model.setUsuario(dto.getUsuario());
		model.setPositiva(dto.isPositiva());
		return model;
	}

	@Override
	public MovimentacaoDTO convertToDTO(Movimentacao model) {
		MovimentacaoDTO dto = new MovimentacaoDTO();
		dto.setId(model.getId());
		dto.setDescricao(model.getDescricao());
		dto.setValor(model.getValor());
		dto.setFixo(model.isFixo());
		dto.setDataCriacao(model.getDataCriacao());
		dto.setMes(model.getMes());
		dto.setAno(model.getAno());
		dto.setCategoria(model.getCategoria());
		dto.setUsuario(model.getUsuario());
		dto.setPositiva(model.isPositiva());
		return dto;
	}
	

}
