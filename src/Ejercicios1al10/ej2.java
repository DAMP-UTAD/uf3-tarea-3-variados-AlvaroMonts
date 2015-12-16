package Ejercicios1al10;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		int b = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		int c = scanner.nextInt();

		if ((a + b + c) / 3 >= 7) {
			System.out.println("Promocionado");
		} else {
			System.out.println("No promocionado");
		}
	}
}
