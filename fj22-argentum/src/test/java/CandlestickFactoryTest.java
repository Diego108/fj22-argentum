import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class CandlestickFactoryTest {

	@Test
	public void testConstroiCandleParaData() {
		

		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(40.5, 2, hoje);
		
		//Com a linha escrita abaixo está sendo feito 
		//o teste de uma negociação apenas
		List<Negociacao> negociacoes = Arrays.asList(negociacao1);
		

		//Com a linha escrita abaixo está sendo feito 
		//o teste de nenhuma negociação apenas
		//List<Negociacao> negociacoes = Arrays.asList();
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		Assert.assertEquals(40.5, candle.getAbertura(), 0.00001); 
		Assert.assertEquals(40.5, candle.getFechamento(), 0.00001); 
		Assert.assertEquals (40.5, candle.getMinimo(), 0.00001);
		Assert.assertEquals(40.5, candle.getMaximo(), 0.00001);
		Assert.assertEquals(81, candle.getVolume(), 0.00001);
	}

}
