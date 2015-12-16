package Ejercicios1al10;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		int b = scanner.nextInt();
		if (a > b) {
			System.out.println("La suma es: " + (a + b) + " y la diferencia: "
					+ (a - b));
		} else if (a < b) {
			System.out.println("El producto es: " + (a * b) + " y la division: "
					+ (a / b));
		}
	}
}
