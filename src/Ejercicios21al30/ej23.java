package Ejercicios21al30;

import java.util.Scanner;

public class ej23 {
	public static void main(String[] args) {
		int numdecuenta = 0, saldo, sum = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Introduzca un numero de cuenta: ");
			numdecuenta = scanner.nextInt();
			System.out.print("Introduzca un saldo: ");
			saldo = scanner.nextInt();

			if (saldo > 0) {
				System.out.println("Esta cuenta es Acreedora");
				sum += saldo;
			} else if (saldo < 0) {
				System.out.println("Esta cuenta es Deudora");
			} else {
				System.out.println("Esta cuenta es Nula");
			}

		} while (numdecuenta > 0);

		System.out.println("La suma total de los acreedores es de: " + sum);
	}
}