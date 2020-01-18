package br.wosiak.marjbillsapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.wosiak.marjbillsapi.converter.Convertable;
import br.wosiak.marjbillsapi.service.BasicService;
import br.wosiak.marjbillsapi.service.exception.EntityNotFoundException;
import br.wosiak.marjbillsapi.service.exception.ServiceException;

public abstract class BasicServiceImpl<TDTO, TENTITY, TID> 
	implements BasicService<TDTO, TID> {
	
	protected abstract Convertable<TENTITY, TDTO> getConverter();
	protected abstract CrudRepository<TENTITY,TID> getRepository();
	
	@Override
	public TDTO salvar(TDTO dto) throws ServiceException {
		TENTITY entity = this.getConverter().convertToModel(dto);
		return this.getConverter().convertToDTO(this.getRepository().save(entity));
	}
	
	@Override
	public void delete(TID id) throws ServiceException {
		this.getRepository().deleteById(id);
	}
	
	@Override
	public TDTO update(TDTO dto) throws ServiceException {
		TENTITY entity = this.getConverter().convertToModel(dto);
		return this.getConverter()
				.convertToDTO(this.getRepository().save(entity));
	}
	
	@Override
	public TDTO findById(TID id) throws EntityNotFoundException, ServiceException {
		TENTITY entity = this.getRepository()
				.findById(id)
				.orElseThrow(()-> new EntityNotFoundException(id));
		return this.getConverter().convertToDTO(entity);
	}
	
	@Override
	public List<TDTO> listAll() throws ServiceException {
		List<TDTO> dtos = new ArrayList<TDTO>();
		Iterable<TENTITY> elements = this.getRepository().findAll();
		elements.forEach(el -> dtos.add(this.getConverter().convertToDTO(el)));
		return dtos;
	}
	
}
