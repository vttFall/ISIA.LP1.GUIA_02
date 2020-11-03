package senati;


import java.util.Scanner;

public class Caso_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		System.out.print("INGRESE NÚMERO: ");
		numero = sc.nextInt();
		
		String estado = "Número IMPAR";
		
		if (numero%2==0)
			estado = "Número PAR";
		
		System.out.println("El número " + numero + " es "+ estado);
	}
}
