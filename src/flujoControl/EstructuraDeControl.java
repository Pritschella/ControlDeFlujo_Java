package flujoControl;

public class EstructuraDeControl { //Debe coincidir la clase con el nombre de nuestro documento

	public static void main(String[] args) { //todo dentro del método main
		
		//Recordar que para que algo se ejecute, siempre debe ir dentro del método principal
		
		//Primero defenir una variable del tipo String donde almaceno un dato
		String citaProgramada = null; //Dejamos en Null y después lo cambiamos a una fecha "28-09-23"
		//La variable declarada, se inicia en null a propósito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		System.out.println("Ya hay una cita Programada, una disculpita");//Porque la variable ya está ocupada o llena
		
		System.out.println("///////////////////////////////////////////");
		
		//Seleccionando una opción y almacenando la variable opción 
		
		int opcion = 5;
		
		//Creamos el menú
		System.out.println("Menú del Diente Feliz, Consultorio Dental");
		System.out.println("1. ¿Desea programar una cita?");
		System.out.println("2. Verificar Cita Programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del Menú");
		System.out.println("Seleccione una opción del Menú (1-4)");
		
		
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opción programar cita."); //Agrega la lógica para programar una cita
			break;
		case 2:
			System.out.println("Usted ha seleccionado la opción verificar cita");
			break;
		case 3:
			System.out.println("Usted ha seleccionado la opción de cancelar cita :( ");
			break;
			
		case 4:
			System.out.println("Usted ha seleccionado la opción salir del menú");
			break;

		default:
			System.out.println("La opción que usted seleccionó no es válida. Por favor seleccione una opción del menú (1-4)");
			break;
		} //switch
		
		
		
		

	}//main

}//clase
