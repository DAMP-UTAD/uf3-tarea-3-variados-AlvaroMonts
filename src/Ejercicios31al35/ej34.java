package Ejercicios31al35;

import java.util.Scanner;

public class ej34 {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		a = scanner.nextInt();
		for (int b = 0; b < 1; b++) {
			for (int c = 0; c < 1; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
// esto solo ha sido un intento, creo que es imposible que un triangulo pueda
// ser rectangulo y equilatero a la vez