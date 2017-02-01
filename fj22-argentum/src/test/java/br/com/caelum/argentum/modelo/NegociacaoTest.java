package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class NegociacaoTest {

	@Test
	public void dataDaNegociacaoImutavel(){
		
		//se criar um negocio no dia 15...
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negociacao n = new Negociacao(10, 5, c);
		
		
		//ainda que eu tente mudar a data para 20
		n.getData().set(Calendar.DAY_OF_MONTH, 20);
		
		//ele continua no dia 15...
		Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void mesmoMilissegundosEDoMesmoDia(){
		
		Calendar hoje = Calendar.getInstance();
		Calendar mesmoMomento =(Calendar) hoje.clone();
		
		Negociacao negociacao = new Negociacao(40.5, 100, hoje);
		Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
	}

	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegociacaoComDataNula(){
		
		new Negociacao(10, 5, null);
	}
	
	@Test
	public void negociacaoComMesmaDataEHorasDiferentes(){
		
		Calendar ago    = new GregorianCalendar(10, 02, 2017, 20, 10, 02);
		Calendar before = new GregorianCalendar(10, 02, 2017, 21, 11, 02);
		
		Negociacao n1 = new Negociacao(45.5, 100, ago);
		Assert.assertTrue(n1.isMesmoDia(before));
		
	}
}
