package Ejercicios1al10;

import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a, digitos = 0;
		System.out.print("Introduzca un numero: ");
		a = scanner.nextInt();

		if (a < 1000 && a > 0) {
			while (a != 0) {
				a /= 10;
				digitos++;
			}
			System.out.println(digitos + " cifras");
		} else {
			System.out.println("Error");
		}


	}
}