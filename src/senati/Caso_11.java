package senati;

import java.util.Scanner;

public class Caso_11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("INGRESE N�MERO [1-7]: ");
		int num_dia = sc.nextInt();
		
		String nombre_dia = "";
		
		switch (num_dia) {
			case 1:
				nombre_dia = "LUNES";
				break;
			case 2:
				nombre_dia = "MARTES";
				break;
			case 3:
				nombre_dia = "MI�RCOLES";
				break;
			case 4:
				nombre_dia = "JUEVES";
				break;
			case 5:
				nombre_dia = "VIERNES";
				break;
			case 6:
				nombre_dia = "S�BADO";
				break;
			case 7:
				nombre_dia = "DOMINGO";
				break;
			default:
				nombre_dia = "D�A DESCONOCIDO";
		}
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("D�A DE LA SEMANA: " + nombre_dia);
		
	}
}