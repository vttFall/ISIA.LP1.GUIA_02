package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("NOMBRE DE EMPLEADO: ");
		String nombre = sc.nextLine(); 
		System.out.print("NIVEL........[1-4]: ");
		int nivel = sc.nextInt(); 
		System.out.print("SUELDO........(S/): ");
		float sueldo = sc.nextFloat(); 
		
		float incremento = 0;
		
		switch (nivel) {
		case 1:
			incremento = 0.045f; 
			break;
		case 2:
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento = 0.11f;
			break;
		}
		
		float nuevo_sueldo = sueldo * (1 + incremento);
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("EMPLEADO.........: " + nombre);
		System.out.println("NIVEL............: " + nivel);
		System.out.println("SUELDO.......(S/): " + df.format(sueldo));
		System.out.println("INCREMENTO.......: " + (incremento*100) + " %");
		System.out.println("NUEVO SUELDO (S/): " + df.format(nuevo_sueldo));

	}
}