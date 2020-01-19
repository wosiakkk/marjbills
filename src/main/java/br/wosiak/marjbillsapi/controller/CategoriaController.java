package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.CategoriaDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController extends BasicRestController<CategoriaDTO, Long> {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Override
	protected BasicService<CategoriaDTO, Long> getBasicService() {
		return this.categoriaService;
	}

}
