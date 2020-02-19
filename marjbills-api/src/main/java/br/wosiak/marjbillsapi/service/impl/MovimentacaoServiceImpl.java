package br.wosiak.marjbillsapi.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.converter.MovimentacaoConverter;
import br.wosiak.marjbillsapi.dto.MovimentacaoDTO;
import br.wosiak.marjbillsapi.model.Categoria;
import br.wosiak.marjbillsapi.model.Movimentacao;
import br.wosiak.marjbillsapi.model.Usuario;
import br.wosiak.marjbillsapi.repository.CategoriaRepository;
import br.wosiak.marjbillsapi.repository.MovimentacaoRepository;
import br.wosiak.marjbillsapi.repository.UsuarioRepository;
import br.wosiak.marjbillsapi.service.MovimentacaoService;
import br.wosiak.marjbillsapi.service.exception.ServiceException;

@Service
public class MovimentacaoServiceImpl extends BasicServiceImpl<MovimentacaoDTO, Movimentacao, Long> implements MovimentacaoService {

	@Autowired
	private MovimentacaoConverter movimentacaoConverter;
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected Convertable<Movimentacao, MovimentacaoDTO> getConverter() {
		return this.movimentacaoConverter;
	}

	@Override
	protected CrudRepository<Movimentacao, Long> getRepository() {
		return this.movimentacaoRepository;
	}
	
	@Override
	public MovimentacaoDTO salvar(MovimentacaoDTO dto) throws ServiceException {
		Optional<Categoria> categoria = categoriaRepository.findById(dto.getCategoria().getId());
		Optional<Usuario> usuario = usuarioRepository.findById(dto.getUsuario().getId());
		if(categoria.get() != null && usuario.get() !=null) {
			dto.setCategoria(categoria.get());
			dto.setUsuario(usuario.get());
		}
		return super.salvar(dto);
	}
}
