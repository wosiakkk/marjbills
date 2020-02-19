package br.wosiak.marjbillsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.wosiak.marjbillsapi.model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
