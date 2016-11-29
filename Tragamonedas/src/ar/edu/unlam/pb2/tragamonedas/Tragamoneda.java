package ar.edu.unlam.pb2.tragamonedas;

public class Tragamoneda {
	private Rodillo rodillo1;
	private Rodillo rodillo2;
	private Rodillo rodillo3;
	private Integer resultado1;
	private Integer resultado2;
	private Integer resultado3;

	public Tragamoneda(Integer cantidadLado) {
		try {
			this.rodillo1 = new Rodillo(cantidadLado);
			this.rodillo2 = new Rodillo(cantidadLado);
			this.rodillo3 = new Rodillo(cantidadLado);
			this.resultado1 = 0;
			this.resultado2 = 0;
			this.resultado3 = 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}

	}

	public Boolean jugar(){
		this.resultado1 = this.rodillo1.numeroAzar();
		this.resultado2 = this.rodillo2.numeroAzar();
		this.resultado3 = this.rodillo3.numeroAzar();
		if (this.resultado1 == this.resultado2){
			if (this.resultado1 == this.resultado3){
				return true;
			}
			else{
				return false;
			}
		}
		else{
				return false;
		
		}
	}

	public Integer getResultado1() {
		// TODO Auto-generated method stub
		return this.resultado1;
	}

	public Integer getResultado2() {
		// TODO Auto-generated method stub
		return this.resultado2;
	}

	public Integer getResultado3() {
		// TODO Auto-generated method stub
		return this.resultado3;
	}
}
