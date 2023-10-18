package JavaEncapsulamiento;

public class ejemplo_Encap_Demo_Main {

	public static void main(String[] args) {
		ejemplo_encap encap = new ejemplo_encap();
		encap.setTipo(5);
		System.out.println("El tipo es: " + encap.getTipo());
	
		ejemplo_encap encap2 = new ejemplo_encap();
		System.out.println("El tipo 2 es: " + encap2.getTipo());
		
	}

}
