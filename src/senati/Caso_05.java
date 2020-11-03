package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_05 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("INGRESE PRECIO (S/): ");
		float precio = sc.nextFloat();
		System.out.print("INGRESE CANTIDAD...: ");
		float cantidad = sc.nextInt();
		
		float total = cantidad * precio;
		float dscto = 0;
		
		if (cantidad > 8)
			dscto = 0.1f * total; // (CAST) forzar el float usando "f"
		
		float neto = total - dscto;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("TOTAL.....(S/): "+ df.format(total));
		System.out.println("DESCUENTO (S/): "+ df.format(dscto));
		System.out.println("NETO......(S/): "+ df.format(neto));
		
	}
}