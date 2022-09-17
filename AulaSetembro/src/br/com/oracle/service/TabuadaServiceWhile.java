package br.com.oracle.service;

import java.util.LinkedList;
import java.util.List;

import br.com.oracle.model.TabuadaModel;

public class TabuadaServiceWhile implements TabuadaService {

	@Override
	public List<Integer> calc(TabuadaModel t) {
		
		List<Integer> resultado = new LinkedList<>();
		int i = 0;
		while (i < t.getLimite())
			resultado.add(t.getMultiplicador() * i++);
		return resultado;
	}

}
