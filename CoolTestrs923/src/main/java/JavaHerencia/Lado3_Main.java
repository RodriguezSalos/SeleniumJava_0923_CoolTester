package JavaHerencia;

public class Lado3_Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo1";
		
		t2.base = 8.0;
		t2.altura = 12.0;
		t2.estilo = "Estilo2";
		
		
		System.out.println("Informacion para T1");
		t1.mostrarEstilo();
		t1.mostrarDimesion();
		System.out.println("Su area es : " + t1.area());
		
		System.out.println("\nInformacion para T2");
		t2.mostrarEstilo();
		t2.mostrarDimesion();
		System.out.println("Su area es : " + t2.area());
		
	}

}
