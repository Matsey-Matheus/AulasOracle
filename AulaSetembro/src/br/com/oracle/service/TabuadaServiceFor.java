package br.com.oracle.service;

import java.util.LinkedList;
import java.util.List;

import br.com.oracle.model.TabuadaModel;

public class TabuadaServiceFor implements TabuadaService {

	@Override
	public List<Integer> calc(TabuadaModel t) {

		List<Integer> resultado = new LinkedList<>();
		
		for (int i = 0; i < t.getLimite(); i++)
			resultado.add(t.getMultiplicador() * i);
		return resultado;


	}

}
