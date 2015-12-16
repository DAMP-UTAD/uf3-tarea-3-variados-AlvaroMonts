package Ejercicios11al20;

import java.util.Scanner;

public class ej14 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		b = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		c = scanner.nextInt();

		int min = a;
		int max = a;

		if (a < b) {
			max = b;
			if (b < c) { // a < b < c
				max = c;
			} else if (c < a) { // c < a < b
				min = c;
				max = b;
			}
		} else if (a > b) {
			min = b;
			if (a < c) { // b < a < c
				min = b;
				max = c;
			} else if (c < b) { // c < b < a
				min = c;
				max = a;
			}
		}

		System.out.print("El numero mas pequeño es: " + min);
		System.out.println();
		System.out.print("El numero mas grande es: " + max);
	}
}