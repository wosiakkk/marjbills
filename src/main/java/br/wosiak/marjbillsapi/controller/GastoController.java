package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.GastoDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.GastoService;

@RestController
@RequestMapping("/gasto")
public class GastoController extends BasicRestController<GastoDTO, Long> {
	
	@Autowired
	private GastoService gastoService;
	
	@Override
	protected BasicService<GastoDTO, Long> getBasicService() {
		return this.gastoService;
	}

}
