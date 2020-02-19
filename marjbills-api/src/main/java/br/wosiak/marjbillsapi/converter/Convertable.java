package br.wosiak.marjbillsapi.converter;

public interface Convertable<TMODEL,TDTO> {
	TMODEL convertToModel(TDTO dto);
	TDTO convertToDTO(TMODEL model);
}
