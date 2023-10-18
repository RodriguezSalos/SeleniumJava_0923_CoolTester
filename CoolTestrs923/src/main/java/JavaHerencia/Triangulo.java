package JavaHerencia;

public class Triangulo extends Dosdimensiones {
	String estilo;
	
	double area() {
		return (base * altura) / 2;
	}
	
	void mostrarEstilo() {

		System.out.println("Estilo del Triangulo es: " + estilo);
		
	}
}
