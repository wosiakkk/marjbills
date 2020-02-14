package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.ControleDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.ControleService;

@RestController
@RequestMapping(value = "/controle")
public class ControleController extends BasicRestController<ControleDTO, Long>{
	
	@Autowired
	private ControleService controleService;
	
	@Override
	protected BasicService<ControleDTO, Long> getBasicService() {
		return this.controleService;
	}

}
