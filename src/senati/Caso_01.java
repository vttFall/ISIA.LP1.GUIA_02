package senati;

import java.util.Scanner;

public class Caso_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int edad=0;
		System.out.print("INGRESE EDAD: ");
		edad=sc.nextInt();
		
		if (edad >= 18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");
		
	}
}
