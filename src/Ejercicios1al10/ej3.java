package Ejercicios1al10;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num;
		int digitos = 0;
		do {
			System.out.print("Introduzca un numero: ");
			num = scanner.nextDouble();
		} while (num <= 0);
		
		while (num != 0) {
			num = (int) num / 10;
			digitos++;
		}
		System.out.print("El numero tiene: " + digitos + " digitos");
	}
}