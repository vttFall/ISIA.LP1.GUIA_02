package senati;


import java.util.Scanner;

public class Caso_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		System.out.print("INGRESE N�MERO: ");
		numero = sc.nextInt();
		
		String estado = "N�mero IMPAR";
		
		if (numero%2==0)
			estado = "N�mero PAR";
		
		System.out.println("El n�mero " + numero + " es "+ estado);
	}
}
