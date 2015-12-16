package Ejercicios1al10;

import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		int b = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		int c = scanner.nextInt();

		int max = a;

		if (a < b) {
			max = b;
		}
		if (c > b && c > a) {
			max = c;
		}

		System.out.print("El numero mas alto es: " + max);
	}
}
