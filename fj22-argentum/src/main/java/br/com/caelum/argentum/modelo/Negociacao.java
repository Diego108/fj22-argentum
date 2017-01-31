package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {

	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return data;
	}
	
	public double getVoume(){
		
		return this.preco * this.quantidade;
	}

	public Negociacao(double preco, int quantidade, Calendar data) {
		
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
}
