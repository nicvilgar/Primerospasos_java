package punto;

public class Circulo {
	//atributos
	Punto centro;
	Double radio;
	
	//constructor
	public Circulo(Punto centro, Double radio) {
		this.centro=centro;
		this.radio=radio;
	}
	
	//getters
	public Punto getcentro() {
		return this.centro;
	}
	
	public Double getradio() {
		return this.radio;
	}
	
	//Representacion como cadena
	public String toString () {
		return "centro: " + this.centro+";radio: " + this.radio;
	}
}
