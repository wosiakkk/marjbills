package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.MovimentacaoDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController extends BasicRestController<MovimentacaoDTO, Long> {
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@Override
	protected BasicService<MovimentacaoDTO, Long> getBasicService() {
		return this.movimentacaoService;
	}

}
