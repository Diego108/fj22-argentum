package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactory {
	
	public static void main(String args[]){
		
		Calendar hoje = Calendar.getInstance();
		
		Negociacao n1 = new Negociacao(40.5, 10, hoje);
		Negociacao n2 = new Negociacao(50.5, 10, hoje);
		Negociacao n3 = new Negociacao(60.5, 10, hoje);
		Negociacao n4 = new Negociacao(70.5, 10, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(n1, n2, n3, n4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick        candle  = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println("Abertura   : " + candle.getAbertura()   + "\n" + 
						   "Fechamento : " + candle.getFechamento() + "\n" + 
						   "Minimo     : " + candle.getMinimo()     + "\n" +
						   "Maximo     : " + candle.getMaximo()     + "\n" +
						   "Volume     : " + candle.getVolume());
	}
}
