package br.wosiak.marjbillsapi.dto;

import java.util.Date;

import br.wosiak.marjbillsapi.model.Categoria;
import br.wosiak.marjbillsapi.model.Mes;
import br.wosiak.marjbillsapi.model.Usuario;

public class MovimentacaoDTO {
	
	private Long id;
	private String descricao;
	private double valor;
	private boolean fixo;
	private Date dataCriacao;
	private Mes mes;
	private int ano;
	private Categoria categoria;
	private Usuario usuario;
	private boolean positiva;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isFixo() {
		return fixo;
	}
	public void setFixo(boolean fixo) {
		this.fixo = fixo;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Mes getMes() {
		return mes;
	}
	public void setMes(Mes mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void setPositiva(boolean positiva) {
		this.positiva = positiva;
	}
	public boolean isPositiva() {
		return positiva;
	}
	
}
