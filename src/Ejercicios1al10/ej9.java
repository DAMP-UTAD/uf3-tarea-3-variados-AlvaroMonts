package Ejercicios1al10;

import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		b = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		c = scanner.nextInt();

		if (a == b && a == c)
			System.out.println((a + b) * c);
	}
}
