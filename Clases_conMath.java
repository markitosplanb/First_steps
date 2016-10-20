
public class Clases_conMath {

	public static void main(String[] args) {
		
		int a=9;
		
		double raiz=Math.sqrt(a); // Math para calcular raiz (Double)
		
		System.out.println(raiz);
		
		double num1=5.85F;
		
		long resultado=Math.round(num1);  // Math para redondear [(double - Long) o (float - int)]
		
		System.out.println(resultado);
		
		double num2=5.89;
		
		int resultado2=(int)Math.round(num2); // Refundición
		
		System.out.println(resultado2);
		
		double base=5F; // Base de la potencia (double a)
		
		double exponent=3; // Exponente de la potencia (double b)
		
		double resultado_de_la_potencia=Math.pow(base, exponent); // Math.pow (double a, double b)
		
		System.out.println(resultado_de_la_potencia); // Resultado de la potencia
		
		
		int base_2=2;
				
		int exponent_2=3;
		
		int resultado_de_la_potencia_2=(int)Math.pow(base_2, exponent_2);
		
		System.out.println(resultado_de_la_potencia_2); // Refundicón de la potencia
		
		System.out.println("El resultado de " + base_2 + " elevado a " + exponent_2 + " es igual a " + resultado_de_la_potencia_2);
		// Concatenación
		

	}

}
