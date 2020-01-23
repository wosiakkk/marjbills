package br.wosiak.marjbillsapi.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.converter.ObjetivoConverter;
import br.wosiak.marjbillsapi.dto.ObjetivoDTO;
import br.wosiak.marjbillsapi.model.Objetivo;
import br.wosiak.marjbillsapi.model.Usuario;
import br.wosiak.marjbillsapi.repository.ObjetivoRepository;
import br.wosiak.marjbillsapi.repository.UsuarioRepository;
import br.wosiak.marjbillsapi.service.ObjetivoService;
import br.wosiak.marjbillsapi.service.exception.ServiceException;

@Service
public class ObjetivoServiceImpl extends BasicServiceImpl<ObjetivoDTO, Objetivo, Long> implements ObjetivoService{
	
	@Autowired
	private ObjetivoConverter objetivoConverter;
	@Autowired
	private ObjetivoRepository objetivoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	protected Convertable<Objetivo, ObjetivoDTO> getConverter() {
		return this.objetivoConverter;
	}

	@Override
	protected CrudRepository<Objetivo, Long> getRepository() {
		return this.objetivoRepository;
	}
	
	@Override
	public ObjetivoDTO salvar(ObjetivoDTO dto) throws ServiceException {
		Optional<Usuario> usuario = usuarioRepository.findById(dto.getUsuario().getId());
		if(usuario.get() != null)
			dto.setUsuario(usuario.get());
		return super.salvar(dto);
	}

}
