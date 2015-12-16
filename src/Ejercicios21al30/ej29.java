package Ejercicios21al30;

import java.util.Scanner;

public class ej29 {
	public static void main(String[] args) {
		int a, b, c; // lados del triangulo
		int equilatero = 0, isosceles = 0, escaleno = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero de triangulos: ");
		int contador = scanner.nextInt();

		for (int nada = 0; contador != 0; contador--) {
			System.out.print("Introduzca un lado: ");
			a = scanner.nextInt();
			System.out.print("Introduzca un lado: ");
			b = scanner.nextInt();
			System.out.print("Introduzca un lado: ");
			c = scanner.nextInt();

			if (a == b && a == c) {
				System.out.println("El triangulo es equilatero");
				equilatero++;
			} else if ((a == b || a == c) && b != c) {
				System.out.println("El triangulo es isosceles");
				isosceles++;
			} else {
				System.out.println("El triangulo es escaleno");
				escaleno++;
			}
		}
		System.out.println("Hay " + equilatero + " equilateros");
		System.out.println("Hay " + isosceles + " isosceles");
		System.out.println("Hay " + escaleno + " escalenos");

		if (equilatero > isosceles) {
			if (isosceles > escaleno) {
				System.out
						.println("Del tipo que menos triangulos hay son los escalenos");
			} else {
				System.out
						.println("Del tipo que menos triangulos hay son los isosceles");
			}
		} else if (equilatero < isosceles) {
			if (equilatero > escaleno) {
				System.out
						.println("Del tipo que menos triangulos hay son los escalenos");
			} else {
				System.out
						.println("Del tipo que menos triangulos hay son los equilateros");
			}
		}
	}
}
