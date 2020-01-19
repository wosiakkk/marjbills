package br.wosiak.marjbillsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.wosiak.marjbillsapi.model.Gasto;

@Repository
public interface GastoRepository extends CrudRepository<Gasto, Long>{

}
