package punto;

public class TestPunto {

	public static void main(String[] args) {
		//EJERCICIO INCIAL 
		System.out.println("EJERCICIO INICIAL");
		Punto p = new Punto (4.7,9.2);
		System.out.println("Valor x de p: "+p.getx());
		p.setx(0.7);
		System.out.println(p);

		//EJERCICIO 1
		System.out.println("EJERCICIO 1");
		Punto A= new Punto (2.,3.);  //poner 2. es lo mismo que poner 2.0
		Punto B=new Punto(5.6,8.7);
		Punto C= new Punto(3.1,4.2); 
		System.out.println("Punto A: " +A);
		System.out.println("Punto B: " +B);
		System.out.println("Punto C: " +C);
		
		//EJERCICIO 2
		System.out.println("EJERCICIO 2");
		Double prom= (A.getx()+B.getx()+C.getx())/3;
		System.out.println("La media de las abcisas es "+prom);
		
		//EJRECICIO 3
		System.out.println("EJERCICIO 3");
		Double d=A.getDistanciaAOtroPunto(B);
		System.out.println("La distancia de A a B es "+d);	
		
		//EJERCICIO 4
		System.out.println("EJERCICIO 4");
		Circulo c=new Circulo (A,8.2);
		System.out.println(c);
	}
}
