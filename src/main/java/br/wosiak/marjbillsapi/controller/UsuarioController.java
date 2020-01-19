package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.UsuarioDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BasicRestController<UsuarioDTO, Long>{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	protected BasicService<UsuarioDTO, Long> getBasicService() {
		return this.usuarioService;
	}
	
}
