package Ejercicios21al30;

import java.util.Scanner;

public class ej22 {
	public static void main(String[] args) {
		int a = 0, suma = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Introduzca un numero: ");
			a = scanner.nextInt();
			if (a != 9999) {
				suma += a;
			}
		} while (a != 9999);
		if (suma > 0) {
			System.out.println("El numero acumulado es positivo y es: " + suma);
		} else if (suma < 0) {
			System.out.println("El numero acumulado es negativo y es: " + suma);
		} else {
			System.out.println("El numero acumulado es cero");
		}
	}
	
}
