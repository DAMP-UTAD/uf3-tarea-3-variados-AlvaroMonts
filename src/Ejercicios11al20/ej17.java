package Ejercicios11al20;

import java.util.Scanner;

public class ej17 {
	public static void main(String[] args) {
		int empleados, sueldo, sumsueldos = 0, sueldomen = 0, sueldomay = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero de empleados: ");
		empleados = scanner.nextInt();

		while (empleados != 0) {
			System.out.print("Introduzca un sueldo: ");
			sueldo = scanner.nextInt();
			if (sueldo >= 100 && sueldo < 300) {
				sueldomen++;
			} else if (sueldo >= 300 && sueldo < 500) {
				sueldomay++;
			}
			sumsueldos = sumsueldos + sueldo;
			empleados--;
		}
		System.out.print("Hay " + sueldomen + " personas cobrando entre 100$ y 300$");
		System.out.println();
		System.out.print("Hay " + sueldomay + " personas cobrando entre 300$ y 500$");
		System.out.println();
		System.out.print("La empresa gasta en sueldos: " + sumsueldos);
	}
}