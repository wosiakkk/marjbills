package br.wosiak.marjbillsapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.converter.UsuarioConverter;
import br.wosiak.marjbillsapi.dto.UsuarioDTO;
import br.wosiak.marjbillsapi.model.Usuario;
import br.wosiak.marjbillsapi.repository.UsuarioRepository;
import br.wosiak.marjbillsapi.service.UsuarioService;

@Service(value = "usuarioService")
public class UsuarioServiceImpl extends BasicServiceImpl<UsuarioDTO, Usuario, Long> implements UsuarioService {

	@Autowired
	private UsuarioConverter usuarioConverter;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected Convertable<Usuario, UsuarioDTO> getConverter() {
		return this.usuarioConverter;
	}

	@Override
	protected CrudRepository<Usuario, Long> getRepository() {
		return this.usuarioRepository;
	}

}
