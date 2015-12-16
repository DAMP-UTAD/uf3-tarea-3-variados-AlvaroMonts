package Ejercicios21al30;

import java.util.Scanner;

public class ej28 {
	public static void main(String[] args) {
		int x, y, primercua = 0, segundocua = 0, tercercua = 0, cuartocua = 0;
		Scanner scanner = new Scanner(System.in);
		System.out
				.print("Introduzca el numero de veces que quiere realizar este proceso: ");
		int numVeces = scanner.nextInt();
		
		for (int numeroquenosirveparanada= 0; numVeces != 0; numVeces--) {
			System.out.print("Introduzca la coordenada X: ");
			x = scanner.nextInt();
			System.out.print("Introduzca la coordenada Y: ");
			y = scanner.nextInt();

			if (x > 0 && y > 0)
				primercua++;
			else if (x < 0 && y > 0)
				segundocua++;
			else if (x < 0 && y < 0)
				tercercua++;
			else if (x > 0 && y < 0)
				cuartocua++;
		}
		System.out.println("1er cuadrante: " + primercua + " numeros");
		System.out.println("2o cuadrante: " + segundocua + " numeros");
		System.out.println("3er cuadrante: " + tercercua + " numeros");
		System.out.println("4o cuadrante: " + cuartocua + " numeros");
	}
}
