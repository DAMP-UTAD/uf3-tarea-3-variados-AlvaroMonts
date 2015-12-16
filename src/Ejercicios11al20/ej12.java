package Ejercicios11al20;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		x = scanner.nextInt();
		System.out.print("Introduzca un numero: ");
		y = scanner.nextInt();

		if (x > 0 && y > 0)
			System.out.println("1er cuadrante");
		else if (x < 0 && y > 0)
			System.out.println("2o cuadrante");
		else if (x < 0 && y < 0)
			System.out.println("3er cuadrante");
		else if (x > 0 && y < 0)
			System.out.println("4o cuadrante");
		else
			System.out.println("El punto se encuentra en un eje");
	}
}
