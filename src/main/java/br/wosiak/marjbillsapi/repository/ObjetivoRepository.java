package br.wosiak.marjbillsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.wosiak.marjbillsapi.model.Objetivo;

@Repository
public interface ObjetivoRepository extends CrudRepository<Objetivo, Long>{

}
