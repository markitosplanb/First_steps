
public class manipula_cadenas2 {

	public static void main(String[] args) {
		
		String frase= ("Hoy es un estupendo día para aprender a programar en Java");
		
		String frase_resumen=frase.substring(29, 57); // Primera cifra (primer carácter en extraer), segunda cifra (primer caracter en "no extraer)
		
		System.out.println(frase);
		
		System.out.println(frase_resumen);
		
		String frase_2="Me gusta programar";
		
		String frase_resumen2=frase_2.substring(0, 8); //Empieza a contar desde cero
		
		System.out.println(frase_resumen2);

	}

}
