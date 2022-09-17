package br.com.oracle.controller;

import java.util.List;

import br.com.oracle.model.TabuadaModel;
import br.com.oracle.service.TabuadaService;
import br.com.oracle.service.TabuadaServiceWhile;

public class TabuadaController {

	private TabuadaService tabuadaService = new TabuadaServiceWhile();
	
	public List<Integer> forMetod(int numero1, int numero2) {
		TabuadaModel t = new TabuadaModel(numero1, numero2 + 1);
		return tabuadaService.calc(t);
	}
	
//	public void whileMetod(int numero1, int numero2) {
//		
//		numero1 = tabuadaService.repeatTab(numero1, numero2).getNumero1();
//		numero2 = tabuadaService.repeatTab(numero1, numero2).getNumero2();
//		
//		int contagem = 0;
//		
//		while(contagem <= numero2) {  
//			System.out.println(numero1 + " x " + contagem + " = " + numero1 * contagem);
//			contagem++;
//		}
//	}
//	
//	public void doWhileMetod(int numero1, int numero2) {
//		
//		numero1 = tabuadaService.repeatTab(numero1, numero2).getNumero1();
//		numero2 = tabuadaService.repeatTab(numero1, numero2).getNumero2();
//		
//		int contagem = 0;
//		
//		do {
//			System.out.println(numero1 + " x " + contagem + " = " + numero1 * contagem);
//			contagem++;
//		} while(contagem <= numero2);
//		
//	}
//	
//	@SuppressWarnings("unused")
//	public void forEach(int numero1, int numero2) {
//		tabuadaService = new TabuadaService();
//		int tabelas[] = new int[numero2 + 1];
//		
//		numero1 = tabuadaService.repeatTab(numero1, numero2).getNumero1();
//		numero2 = tabuadaService.repeatTab(numero1, numero2).getNumero2();
//		
//		int contagem = 0;
//		
//		for(int tabuada:tabelas) {
//			System.out.println(numero1 + " x " + contagem + " = " + numero1 * contagem);
//			contagem++;
//		}
//		
//	}
	
}
