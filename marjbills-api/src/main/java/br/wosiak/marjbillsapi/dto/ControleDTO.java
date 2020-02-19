package br.wosiak.marjbillsapi.dto;

import java.util.List;

import br.wosiak.marjbillsapi.model.Mes;
import br.wosiak.marjbillsapi.model.Usuario;

public class ControleDTO {
	
	private Long id;
	private Long ano;
	private String descricao;
	private Usuario usuario;
	private List<Mes> meses;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAno() {
		return ano;
	}
	public void setAno(Long ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Mes> getMeses() {
		return meses;
	}
	public void setMeses(List<Mes> meses) {
		this.meses = meses;
	}
	
}
