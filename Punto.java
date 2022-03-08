package punto;
/*
 * Estamos diseñando un tipo nuevo que se llama Punto
 */
public class Punto {
	//Atributos de la clase (las caracteristicas del ejercicio, en este caso, las caracteristicas del punto)
	private Double x;  //Double = numero real
	private Double y;
	
	//método constructor (metodo = funcion)
	public Punto(Double x, Double y) {
		this.x= x;
		this.y=y;
	}
	
	//metodo toString (pa ponerlo bonito)
	public String toString () {
		return "(" + x+","+y+")";
	}
	
	//metodo getters (observadores o consultables)
	public Double getx() {
		return this.x;
	}
	
	public Double gety() {
		return this.y;
	}
	
	//metodo setters (modificadores)
	public void setx(Double x1) {
		x=x1;
	}
	public void sety(Double y1) {
		y=y1;
	}
	
	//métodos adicionales
	public Double getDistanciaAOtroPunto (Punto p) {
		Double dx= p.x-this.x;
		Double dy=p.y  - this.y;
		return Math.sqrt(dx*dx+dy*dy);
		/*
		 * Punto p1=new...
		 * Punto p2= new...
		 * p1.getDistanciaAOtroPunto (p2)
		 */
	}
		
}
