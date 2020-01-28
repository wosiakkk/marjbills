package br.wosiak.marjbillsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.wosiak.marjbillsapi.dto.MesDTO;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.MesService;

@RestController
@RequestMapping("/mes")
public class MesController extends BasicRestController<MesDTO, Long>{
	
	@Autowired
	private MesService mesService;
	
	@Override
	protected BasicService<MesDTO, Long> getBasicService() {
		return mesService;
	}
	

}
