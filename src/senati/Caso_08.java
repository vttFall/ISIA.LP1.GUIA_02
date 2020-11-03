package senati;

import java.util.Scanner;

public class Caso_08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("INGRESE NOTA: ");
		int nota = sc.nextInt();
		
		String estado = "";
		
		if (nota >= 0 && nota <= 7)
			estado = "SIN PALABRAS";
		else if (nota >= 8 && nota <= 10)
			estado = "MALO";
		else if (nota >= 11 && nota <= 14)
			estado = "REGULAR";
		else if (nota >= 15 && nota <= 17)
			estado = "NOTABLE";
		else if (nota >= 18 && nota <= 20)
			estado = "EXCELENTE";
		else 
			estado = "NOTA INVÁLIDA";
		
		System.out.println("ESTADO OBTENIDO: " + estado);
		
	}
}