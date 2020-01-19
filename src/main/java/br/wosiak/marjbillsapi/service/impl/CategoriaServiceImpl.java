package br.wosiak.marjbillsapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.wosiak.marjbillsapi.converter.CategoriaConverter;
import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.dto.CategoriaDTO;
import br.wosiak.marjbillsapi.model.Categoria;
import br.wosiak.marjbillsapi.repository.CategoriaRepository;
import br.wosiak.marjbillsapi.service.CategoriaService;

@Service
public class CategoriaServiceImpl extends BasicServiceImpl<CategoriaDTO, Categoria, Long> implements CategoriaService {
	
	@Autowired
	private CategoriaConverter categoriaConverter;
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	protected Convertable<Categoria, CategoriaDTO> getConverter() {
		return this.categoriaConverter;
	}

	@Override
	protected CrudRepository<Categoria, Long> getRepository() {
		return this.categoriaRepository;
	}
	
}
