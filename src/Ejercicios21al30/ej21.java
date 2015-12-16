package Ejercicios21al30;

import java.util.Scanner;

public class ej21 {
	public static void main(String[] args) {
		int a = 0, b = 0, numero, pares = 0, impares = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero de numeros: ");
		b = scanner.nextInt();
		a = b;
		while (a != 0) {
			System.out.print("Introduzca un numero: ");
			numero = scanner.nextInt();
			if (numero % 2 == 0)
				pares++;
			else if (numero % 2 == 1)
				impares++;
			a--;
		}
		System.out.println("Hay " + pares + " numeros pares");
		System.out.println("Hay " + impares + " numeros impares");
	}
}
