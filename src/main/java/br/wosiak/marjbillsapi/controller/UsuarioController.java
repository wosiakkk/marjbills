package br.wosiak.marjbillsapi.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@Override
	public ResponseEntity<UsuarioDTO> salvar(@RequestBody UsuarioDTO dto) {
		try {
			UsuarioDTO dtoResponse = usuarioService.salvar(dto);
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+dtoResponse.getId()).buildAndExpand(dto.getId())
					.toUri();
			return ResponseEntity.created(location).body(dtoResponse);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
