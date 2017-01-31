package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.List;

public class CandlestickFactory {
	
	public Candlestick constroiCandleParaData(Calendar data, List<Negociacao> negociacoes){
		
		double maximo = 0;
		double minimo = negociacoes.get(0).getPreco();
		double volume = 0;
		
		for(Negociacao n : negociacoes){
			
			if(n.getPreco() > maximo){
				
				maximo = n.getPreco();
			}
			if(n.getPreco() < minimo){
				
				minimo = n.getPreco();
			}
			
			volume += n.getPreco();
		}
		
		double abertura = negociacoes.get(0).getPreco();
		double fechamento = negociacoes.get(negociacoes.size()-1).getPreco();
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	}
}
