package Ejercicios11al20;

import java.util.Scanner;

public class ej11 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		b = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		c = scanner.nextInt();
		
		if (a < 10 || b < 10 || c < 10)
			System.out.println("Alguno de los numeros es menor que 10");
	}
}
