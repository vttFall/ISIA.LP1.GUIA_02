package senati;

import java.util.Scanner;

public class Caso_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1=0, n2=0, n3=0;
		System.out.print("INGRESE NÚMERO 1: ");
		n1 = sc.nextInt();
		System.out.print("INGRESE NÚMERO 2: ");
		n2 = sc.nextInt();
		System.out.print("INGRESE NÚMERO 3: ");
		n3 = sc.nextInt();
		
		String estado = "";
		
		if (n1==n2 && n1==n2)
			estado = "LOS 3 #s SON IGUALES";
		else if (n1>n2 && n1>n3)
			estado = "EL #1 >> "+ n1 + ", ES EL MAYOR";
		else if (n2>n1 && n2>n3)
			estado = "EL #2 >> "+ n2 + ", ES EL MAYOR";
		else
			estado = "EL #3 >> "+ n3 + ", ES EL MAYOR";
		
		System.out.println("RESULTADO: "+ estado);

	}
}