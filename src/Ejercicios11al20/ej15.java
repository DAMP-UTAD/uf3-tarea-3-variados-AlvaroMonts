package Ejercicios11al20;

import java.util.Scanner;

public class ej15 {
	public static void main(String[] args) {
		int a, notasbuenas = 0;
		Scanner scanner = new Scanner(System.in);
		int numveces = 10;
		while (numveces != 0) {
			System.out.print("Introduzca un numero: ");
			a = scanner.nextInt();
			if (a >= 7) {
				notasbuenas++;
				numveces--;
			} else {
				numveces--;
			}
		}
		System.out.println("Hay " + notasbuenas + " notas por encima del 7");
	}
}
