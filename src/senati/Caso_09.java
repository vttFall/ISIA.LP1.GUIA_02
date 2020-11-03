package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_09 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("INGRESE NOMBRE DE ALUMNO.: ");
		String nombre = sc.nextLine();
		
		System.out.print("INGRESE NOTA #1..........: ");
		int nota1 = sc.nextInt();
		
		System.out.print("INGRESE NOTA #2..........: ");
		int nota2 = sc.nextInt();
		
		System.out.print("INGRESE ASISTENCIA [1-12]: ");
		float num_asistencia = sc.nextFloat();
		
		float promedio = (nota1 * 0.3f) + (nota2 * 0.7f);
		float porc_asistencia = num_asistencia/12;
		
		String estado = "DESAPROBADO";
		
		if (promedio >= 13 && porc_asistencia >= 0.7)
			estado = "APROBADO";
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("ALUMNO....: " + nombre);
		System.out.println("PROMEDIO..: " + promedio);
		System.out.println("ASISTENCIA: " + df.format(porc_asistencia*100) + " %");
		System.out.println("ESTADO....: " + estado);
		
	}
}