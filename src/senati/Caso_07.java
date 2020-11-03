package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("�.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("INGRESE SUELDO: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = 0.08f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("IMPUESTO: " + df.format(impuesto));

	}
}