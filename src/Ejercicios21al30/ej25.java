package Ejercicios21al30;

import java.util.Scanner;

public class ej25 {
	public static void main(String[] args) {
		int suma = 0, a;
		Scanner scanner = new Scanner(System.in);

		for (int numeros = 10; numeros != 0; numeros--) {
			System.out.print("Introduzca un numero: ");
			a = scanner.nextInt();
			if (numeros <= 5) {
				suma += a;
			}
		}
		System.out.println("La suma de los ultimos 5 valores es de: " + suma);
	}
}
