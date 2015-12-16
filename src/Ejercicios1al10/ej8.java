package Ejercicios1al10;

import java.util.Scanner;

public class ej8 {
	public static void main(String[] args) {
		int dia, mes;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un mes: ");
		mes = scanner.nextInt();
		System.out.print("Introduzca un dia del mes: ");
		dia = scanner.nextInt();

		if (dia == 25 && mes == 12)
			System.out.println("Corresponde a Navidad");
		else
			System.out.println("No corresponde a Navidad");
	}

}
