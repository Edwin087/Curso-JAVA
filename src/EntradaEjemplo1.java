import java.util.*;

public class EntradaEjemplo1 {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor" );
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introdusca su edad por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Introdusca su numero con decimales favorito");

		double numero_decimal= entrada.nextDouble();
				
				
				
		System.out.println("Hola " + nombre_usuario  +
				" el año que viene tendra " + (edad+1 ) + " años " + " y tu numero favorito es:  " + numero_decimal  );

	}

}
