package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("N�MERO 1.......: ");
		float n1=sc.nextFloat();
		System.out.print("N�MERO 2.......: ");
		float n2=sc.nextFloat();
		System.out.print("OPERACI�N [1-6]: ");
		int nope=sc.nextInt();
		
		String rpta = "0", nameope = "NO ASIGNADA";
		
		switch (nope) {
		case 1:
			nameope = "SUMA";
			rpta = String.valueOf(n1+n2);
			break;
		case 2:
			nameope = "RESTA";
			rpta = String.valueOf(n1-n2);
			break;
		case 3:
			nameope = "PRODUCTO";
			rpta = String.valueOf(n1*n2);
			break;
		case 4:
			nameope = "DIVISI�N";
			if (n2 != 0) {
				rpta = String.valueOf(df.format(n1/n2));
			}else{
				rpta = "NO DEFINIDO";
			}
			break;
		case 5:
			nameope = "RESTO";
			if (n2 != 0) {
				rpta = String.valueOf(n1%n2);
			}else{
				rpta = "#2 NO PERMITIDO";
			}
			break;
		case 6:
			nameope = "PROMEDIO";
			rpta = String.valueOf(df.format((n1+n2)/2));
			break;
		}
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("N�MERO 1 : "+ n1);
		System.out.println("N�MERO 2 : "+ n2);
		System.out.println("OPERACI�N: "+ nameope);
		System.out.println("RESULTADO: "+ rpta);
	}
}