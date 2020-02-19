package br.wosiak.marjbillsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.wosiak.marjbillsapi.model.Controle;

@Repository
public interface ControleRepository extends CrudRepository<Controle, Long> {

}
