package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {

	public final double preco;
	public final int quantidade;
	public final Calendar data;
	
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
		
		return preco * quantidade;
	}

	public Negociacao(double preco, int quantidade, Calendar data) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
}
