
public class manipula_cadenas {

	public static void main(String[] args) {
		
		String nombre="David";
		
		System.out.println("Mi nombre es " + nombre + ".");
		
		System.out.println(nombre + " tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0) + ".");
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la última es la " + nombre.charAt(ultima_letra-1) + "."); //El menos 1 es porque en charAt() se empieza a contar desde cero.
		
	}

}
