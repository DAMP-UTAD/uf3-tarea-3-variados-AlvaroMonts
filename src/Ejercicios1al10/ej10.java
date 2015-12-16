package Ejercicios1al10;

import java.util.Scanner;

public class ej10 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		b = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		c = scanner.nextInt();

		if (c < 10 && b < 10 && a < 10)
			System.out.println("Todos los numeros son menores a 10");
	}
}