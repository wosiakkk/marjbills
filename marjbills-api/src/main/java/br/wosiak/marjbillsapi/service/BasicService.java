package br.wosiak.marjbillsapi.service;

import java.util.List;

import br.wosiak.marjbillsapi.service.exception.EntityNotFoundException;
import br.wosiak.marjbillsapi.service.exception.ServiceException;

public interface BasicService<TDTO, TID> {
	TDTO salvar(TDTO dto) throws ServiceException;
	void delete(TID id) throws ServiceException;
	TDTO update(TDTO dto) throws ServiceException;
	List<TDTO> listAll() throws ServiceException; 
	TDTO findById(TID id) throws EntityNotFoundException,ServiceException;
}
