package br.wosiak.marjbillsapi.converter;

import br.wosiak.marjbillsapi.dto.UsuarioDTO;
import br.wosiak.marjbillsapi.model.Usuario;

public class UsuarioConverter implements Convertable<Usuario, UsuarioDTO>{

	@Override
	public Usuario convertToModel(UsuarioDTO dto) {
		Usuario model = new Usuario();
		model.setId(Long.parseLong(dto.getId()));
		model.setNome(dto.getNome());
		model.setEmail(dto.getEmail());
		model.setSenha(dto.getSenha());
		return model;
	}

	@Override
	public UsuarioDTO convertToDTO(Usuario model) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(String.valueOf(model.getId()));
		dto.setNome(model.getNome());
		dto.setEmail(model.getEmail());
		dto.setSenha(model.getSenha());
		return dto;
	}

}
