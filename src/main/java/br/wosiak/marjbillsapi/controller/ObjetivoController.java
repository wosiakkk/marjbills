package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.ObjetivoDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.ObjetivoService;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController extends BasicRestController<ObjetivoDTO, Long>{

	@Autowired
	private ObjetivoService objetivoService;
	
	@Override
	protected BasicService<ObjetivoDTO, Long> getBasicService() {
		return this.objetivoService;
	}

}
