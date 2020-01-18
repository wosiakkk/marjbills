package br.wosiak.marjbillsapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.exception.ServiceException;

public abstract class BasicRestController<TDTO, TID> {

	protected abstract BasicService<TDTO, TID> getBasicService();
	
	@GetMapping
	public ResponseEntity<List<TDTO>> listarTodos(){
		try {
			return ResponseEntity.ok(this.getBasicService().listAll());
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TDTO> buscarPorId(@PathVariable(name = "id") TID id ){
		try {
			return ResponseEntity.ok(this.getBasicService().findById(id));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<TDTO> salvar(@RequestBody TDTO dto){
		try {
			return ResponseEntity.ok(this.getBasicService().salvar(dto));
		} catch (ServiceException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<TDTO> atualizar(@RequestBody TDTO dto){
		try {
			return ResponseEntity.ok(this.getBasicService().salvar(dto));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<TDTO> excluir(@PathVariable(name = "id") TID id){
		try {
			this.getBasicService().delete(id);
			return ResponseEntity.ok().body(null);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
