package br.wosiak.marjbillsapi.dto;

import java.util.Date;
import java.util.List;

import br.wosiak.marjbillsapi.model.Movimentacao;
import br.wosiak.marjbillsapi.model.Usuario;

public class MesDTO {
	private Long id;
	private Date data;
	private String nome;
	private Usuario usuario;
	private List<Movimentacao> movimentacoes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

}
