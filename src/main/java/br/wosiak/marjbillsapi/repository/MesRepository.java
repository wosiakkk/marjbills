package br.wosiak.marjbillsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.wosiak.marjbillsapi.model.Mes;

@Repository
public interface MesRepository extends CrudRepository<Mes, Long>{

}
