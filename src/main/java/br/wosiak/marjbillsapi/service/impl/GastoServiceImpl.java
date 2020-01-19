package br.wosiak.marjbillsapi.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.converter.GastoConverter;
import br.wosiak.marjbillsapi.dto.GastoDTO;
import br.wosiak.marjbillsapi.model.Categoria;
import br.wosiak.marjbillsapi.model.Gasto;
import br.wosiak.marjbillsapi.model.Usuario;
import br.wosiak.marjbillsapi.repository.CategoriaRepository;
import br.wosiak.marjbillsapi.repository.GastoRepository;
import br.wosiak.marjbillsapi.repository.UsuarioRepository;
import br.wosiak.marjbillsapi.service.GastoService;
import br.wosiak.marjbillsapi.service.exception.ServiceException;

@Service
public class GastoServiceImpl extends BasicServiceImpl<GastoDTO, Gasto, Long> implements GastoService {

	@Autowired
	private GastoConverter gastoConverter;
	@Autowired
	private GastoRepository gastoRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected Convertable<Gasto, GastoDTO> getConverter() {
		return this.gastoConverter;
	}

	@Override
	protected CrudRepository<Gasto, Long> getRepository() {
		return this.gastoRepository;
	}
	
	@Override
	public GastoDTO salvar(GastoDTO dto) throws ServiceException {
		Optional<Categoria> categoria = categoriaRepository.findById(dto.getCategoria().getId());
		Optional<Usuario> usuario = usuarioRepository.findById(dto.getUsuario().getId());
		if(categoria.get() != null && usuario.get() !=null) {
			dto.setCategoria(categoria.get());
			dto.setUsuario(usuario.get());
		}
		return super.salvar(dto);
	}
}
