package br.wosiak.marjbillsapi.repository;

import org.springframework.data.repository.CrudRepository;

import br.wosiak.marjbillsapi.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
