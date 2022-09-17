package br.com.oracle.model;

import java.util.List;

public class TabuadaModel {

	private int multiplicador;
	private int limite;
	private List <Integer> resultados;
	
	public TabuadaModel(int multiplicador, int limite) {
		this.multiplicador = multiplicador;
		this.limite = limite;
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public List<Integer> getResultados() {
		return resultados;
	}

	public void setResultados(List<Integer> resultados) {
		this.resultados = resultados;
	}
	
	
	
}
