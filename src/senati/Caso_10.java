package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		DecimalFormat dfe=new DecimalFormat("#");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("INGRESE NOMBRE DE EMPLEADO..: ");
		String empleado = sc.nextLine();
		System.out.print("INGRESE HORAS TRABAJADAS....: ");
		float horas = sc.nextFloat();
		System.out.print("INGRESE TARIFA POR HORA (S/): ");
		float tarifa = sc.nextFloat();
		System.out.print("INGRESE MINUTOS DE TARDANZA.: ");
		int minutos = sc.nextInt();
		
		float importe = horas * tarifa;
		
		float bono = (0.04f*importe);
		if (horas > 60)
			bono = (0.13f*importe);
		
		float descuento = 0*importe;
		if (minutos > 15)
			descuento = 0.03f*importe;
		
		float meta = (horas/70)*100;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("EMPLEADO............: " + empleado);
		System.out.println("HORAS TRABAJADAS....: " + dfe.format(horas));
		System.out.println("TARIFA POR HORA (S/): " + df.format(tarifa));
		System.out.println("IMPORTE.........(S/): " + df.format(importe));
		System.out.println("BONO............(S/): " + df.format(bono));
		System.out.println("DESCUENTO.......(S/): " + df.format(descuento));
		System.out.println("META ALCANZADA......: " + df.format(meta) + " %");

	}
}