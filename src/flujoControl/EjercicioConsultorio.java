package flujoControl;

import java.util.Scanner;

public class EjercicioConsultorio {

	public static void main(String[] args) {
		
		/*
Verificar edad del paciente (hacerlo como queramos). Ponerle si no se le puede dar un tratamiento, si requiere ir acompañado de un adulto, etc. 
		 */

		Scanner sc = new Scanner(System.in);
		
		//String nombre = lectura.next();
		
		byte edad = 17;
		
		if(edad >= 18) {
			System.out.println("Felicidades, ya no necesitas que tu mamá no te acompañe a hacer el trámite");
		}else {
			System.out.println("Dile a tu mamá que tas chiquito, que te acompañe");
		}
		
		
		System.out.println("-----  Operador condicional ? -----");
		boolean pago = true;
		
		String resultado = (pago) ? "Ya pagó" : "Págame";
		System.out.println("El paciente " + resultado);
		

	}//main

}//clase
