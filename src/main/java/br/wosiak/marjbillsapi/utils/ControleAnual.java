package br.wosiak.marjbillsapi.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.wosiak.marjbillsapi.model.Controle;
import br.wosiak.marjbillsapi.model.Mes;

@Component
public class ControleAnual {
	
	private final String[] meses = {
			"Janeiro","Fevereiro","Março","Abril",
			"Maio", "Junho", "Julho", "Agosto","Setembro",
			"Outubro", "Novembro","Dezembro"
	};
	
	public List<Mes> gerarAnoCompleto(Controle controle){
		List<Mes> ano = new ArrayList<>();
		for (String string : meses) {
			Mes mes = new Mes();
			mes.setControle(controle);
			mes.setNome(string);
			ano.add(mes);
		}
		return ano;
	}
	
}
