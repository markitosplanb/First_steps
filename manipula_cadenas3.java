
public class manipula_cadenas3 {

	public static void main(String[] args) {
		
		String alumno1, alumno2; //Dos declaraciones distintas en la misma l�nea.
		
		alumno1="Marcos";
		
		alumno2="Marcos";
		
		System.out.println(alumno1.equals(alumno2)); //Tiene en cuenta may�sculas y min�sculas.
		
		String alumno3, alumno4;
		
		alumno3="Marcos";
		
		alumno4="marcos";		
		
		System.out.println(alumno3.equalsIgnoreCase(alumno4)); //No tiene en cuenta may�sculas y min�sculas.

	}

}
