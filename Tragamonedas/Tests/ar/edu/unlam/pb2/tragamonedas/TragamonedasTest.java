package ar.edu.unlam.pb2.tragamonedas;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	
	@Test
	public void queElTragamonedaSeCreaConLadosMayorA1(){
		Integer lado = 2;
		Tragamoneda t1 = new Tragamoneda(lado);
		
		t1.jugar();
		
		Assert.assertTrue((t1.getResultado1() <= lado) && (t1.getResultado2() <= lado) && (t1.getResultado3() <= lado));
	}
	
	@Test
	public void queDaErrorConLadoMenorA1 (){
		Integer lado = 1;
		Tragamoneda t1 = new Tragamoneda(lado);
		
	}
	
	@Test
	public void queDependeDelAzar(){
		Integer lado = 2;
		Tragamoneda t1 = new Tragamoneda(lado);
		
		if(t1.jugar()){
			System.out.println("Usted a GANADO!");
		}
		else{
			System.out.println("Has perdido. Pero puedes seguir participando!");
		}
	}
}
