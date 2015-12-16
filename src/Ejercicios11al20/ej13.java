package Ejercicios11al20;

import java.util.Scanner;

public class ej13 {
	public static void main(String[] args) {
		int sueldo, antig;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un sueldo: ");
		sueldo = scanner.nextInt();
		System.out.print("Introduzca los años que lleva en la empresa: ");
		antig = scanner.nextInt();

		if (sueldo < 500 && antig >= 10) {
			sueldo += (sueldo * 20) / 100;
			System.out.print("Su nuevo sueldo es de: " + sueldo);
		} else if (sueldo < 500 && antig < 10) {
			sueldo += (sueldo * 5) / 100;
			System.out.print("Su nuevo sueldo es de: " + sueldo);
		} else {
			System.out.println("Su sueldo es de: " + sueldo);
		}
	}
}