package br.wosiak.marjbillsapi.converter;

public interface Convertable<TModel,TDto> {
	TModel convertToModel(TDto dto);
	TDto convertToDTO(TModel model);
}
