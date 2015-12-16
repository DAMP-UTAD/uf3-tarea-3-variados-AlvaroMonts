package Ejercicios11al20;

import java.util.Scanner;

public class ej20 {
	public static void main(String[] args) {
		int valores = 0, a, b, sumnumeros1 = 0, sumnumeros2 = 0;
		System.out.println("Numeros para la lista 1");

		// lista 1
		while (valores != 15) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Introduzca un numero: ");
			a = scanner.nextInt();
			valores++;
			sumnumeros1 = sumnumeros1 + a;
		}
		valores -= 15;
		
		System.out.println("Numeros para la lista 2");
		// lista 2
		while (valores != 15) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Introduzca un numero: ");
			b = scanner.nextInt();
			valores++;
			sumnumeros2 = sumnumeros2 + b;
		}
		
		if (sumnumeros1 > sumnumeros2)
			System.out.println("Lista 1 es mayor");
		else if (sumnumeros2 > sumnumeros1)
			System.out.println("Lista 2 es mayor");
		else
			System.out.println("Listas iguales");
	}
}