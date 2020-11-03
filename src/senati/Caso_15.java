package senati;

import java.util.Scanner;

public class Caso_15 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("CLIENTE: ");
		String nombre = sc.nextLine();
		System.out.print("PRODUCTO [TB/LT/MN/IM]: ");
		String cod_producto = sc.nextLine();
		System.out.print("CANTIDAD: ");
		int cantidad = sc.nextInt();
		
		sc.nextLine(); // REINICIAR LECTURA DE STRING
		
		System.out.print("FORMA DE PAGO [C1/C2]: ");
		String cod_forma = sc.nextLine();
		
		float precio=0;
		String nombre_producto = "PRODUCTO DESCONOCIDO";
		
		switch (cod_producto) {
			case "TB":
				precio = 350;
				nombre_producto = "TABLET 1GB";
				break;
			case "LT":
				precio = 2300;
				nombre_producto = "LAPTOP CORE I5 8GB RAM";
				break;
		}
		
		float importe = cantidad * precio;
		float valor = 0;
		String forma_pago = "FORMA DE PAGO DESCONOCIDO";
		
		switch (cod_forma) {
			case "C1":
				valor = importe * 0.95f;
				forma_pago = "CONTADO";
				break;
			case "C2":
				valor = importe * 1.12f;
				forma_pago = "CRÉDITO";
				break;
		}
		
		System.out.println("\nRESULTADOS");
		System.out.println("==========");
		System.out.println("CLIENTE......: " + nombre);
		System.out.println("PRODUCTO.....: " + nombre_producto);
		System.out.println("PRECIO.......: " + precio);
		System.out.println("CANTIDAD.....: " + cantidad);
		System.out.println("IMPORTE......: " + importe);
		System.out.println("FORMA DE PAGO: " + forma_pago);
		
		if (cod_forma.equals("C1")) {
			System.out.println("DESCUENTO....: " + (importe - valor));
			System.out.println("TOTAL A PAGAR: " + valor);
		}
		else if (cod_forma.equals("C2")) {
			System.out.println("INBREMENTO...: " + (importe + valor));
			System.out.println("TOTAL A PAGAR: " + valor);
		}
	}
}