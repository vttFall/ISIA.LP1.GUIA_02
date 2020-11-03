package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("INGRESE NOMBRE............: ");
		String alumno = sc.nextLine();
		System.out.print("INGRESE CARRERA [DS/RC/DG]: ");
		String kc = sc.nextLine();
		System.out.print("INGRESE TURNO......[M/T/N]: ");
		String kt = sc.nextLine();
		
		//kc >> key carrera; kt >> key turno
		
		int monto=0;
		String carrera = "NO ASIGNADA";
		
		switch (kc) {
			case "DS":
				carrera = "DESARROLLO DE SOFTWARE";
				monto = 1500;
				break;
			case "RC":
				carrera = "REDES Y CONECTIVIDAD";
				monto = 1400;
				break;
			case "DG":
				carrera = "DISEÑO GRÁFICO";
				monto = 1300;
				break;
		}
		
		float disc=0;
		String turno = "NO ASIGNADO";
		
		switch (kt) {
			case "M":
				turno = "MAÑANA";
				disc = 0.1f * monto; // 10% descuento
				break;
			case "T":
				turno = "TARDE";
				disc = 0.2f * monto; // 20% descuento
				break;
			case "N":
				turno = "NOCHE";
				disc = 0.15f * monto; // 15% descuento
				break;
		}
		
		float total = monto - disc;
		float total2 = total/3.33f;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("ALUMNO....: "+alumno);
		System.out.println("CARRERA...: "+carrera);
		System.out.println("TURNO.....: "+turno);
		System.out.println("MONTO.....(PEN): "+ df.format(monto));
		System.out.println("DESCUENTO (PEN): "+ df.format(disc));
		System.out.println("TOTAL.....(PEN): "+ df.format(total));
		System.out.println("TOTAL.....(USD): "+ df.format(total2));
		
	}
}