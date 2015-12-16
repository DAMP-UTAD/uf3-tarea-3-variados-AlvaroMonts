package Ejercicios21al30;

import java.util.Scanner;

public class ej27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.print("Introduzca un numero: ");
			a = scanner.nextInt();
		} while (a < 1 || a > 10);
		for (int mult = 1; mult != 13; mult++) {
			System.out.println(a + " * " + mult + " = " + (a * mult));
		}
	}
}
