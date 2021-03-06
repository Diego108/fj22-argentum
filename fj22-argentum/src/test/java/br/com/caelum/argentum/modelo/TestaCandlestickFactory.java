package br.com.caelum.argentum.modelo;

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
	
		Calendar amanha = (Calendar)hoje.clone();
		amanha.add(Calendar.DAY_OF_MONTH, 1);
		
		Negociacao n5 = new Negociacao(40.5, 10, amanha);
		Negociacao n6 = new Negociacao(50.5, 10, amanha);
		Negociacao n7 = new Negociacao(60.5, 10, amanha);
		Negociacao n8 = new Negociacao(70.5, 10, amanha);
	
		Calendar depoisDezDias = (Calendar) hoje.clone();
		depoisDezDias.add(Calendar.DAY_OF_MONTH, 10);
		
		List<Negociacao> negociacoes = Arrays.asList(n1, n2, n3, n4, n5, n6, n7, n8);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick        candle  = fabrica.constroiCandleParaData(hoje, negociacoes);
	}
}
