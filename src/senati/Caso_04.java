package senati;

import java.util.Scanner;

public class Caso_04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("INGRESE #1: ");
		int n1 = sc.nextInt();
		System.out.print("INGRESE #2: ");
		int n2 = sc.nextInt();
		
		String clave = "LOS NÚMEROS SON IGUALES";
		if (n1 < n2)
			clave = "EL #1 ES MENOR";
		else if (n2 < n1)
			clave = "EL #2 ES MENOR";

		System.out.println("\nSALIDA DE DATOS\n===============");
		System.out.println(clave);

	}
}