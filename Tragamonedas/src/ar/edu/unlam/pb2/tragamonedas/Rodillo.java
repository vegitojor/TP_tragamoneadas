package ar.edu.unlam.pb2.tragamonedas;

import java.util.Random;

public class Rodillo {
	private Integer lado;
	
	public Rodillo(Integer lado) throws Exception{
		if (lado > 1){
		this.lado = lado;
		}
		else{
			throw new Exception ("Se ingreso una cantidad de lados incorrecta.");
		}
	}
	
	public Integer numeroAzar(){
		Random aleatorio = new Random();
		return (int)(aleatorio.nextDouble() * this.lado + 1);
	}
}
