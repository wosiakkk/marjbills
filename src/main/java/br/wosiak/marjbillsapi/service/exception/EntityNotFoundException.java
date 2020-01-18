package br.wosiak.marjbillsapi.service.exception;

public class EntityNotFoundException extends ServiceException{
	
	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundException(Object id) {
		super("Não foram encontrados resultados: "+id);
	}

}
