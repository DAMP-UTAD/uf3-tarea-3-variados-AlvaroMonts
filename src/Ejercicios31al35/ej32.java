package Ejercicios31al35;

import java.util.Scanner;

public class ej32 {
	public static void main(String[] args) {
		int numestMaņana = 50, numestTarde = 60, numestNoche = 110; // contadores
																	// de
																	// estudiantes
		int edadmaņana, edadtarde, edadnoche; // edades que se introducen
		int totaledadmaņana = 0, totaledadtarde = 0, totaledadnoche = 0; // suma
																			// de
																			// edades
		int promedioedad1, promedioedad2, promedioedad3; // promedios
		Scanner scanner = new Scanner(System.in);

		System.out.println("Edades de los estudiantes de horario de maņana");
		int aux1 = numestMaņana;
		for (numestMaņana = 50; numestMaņana != 0; numestMaņana--) {
			System.out.print("Introduzca un edad: ");
			edadmaņana = scanner.nextInt();
			totaledadmaņana += edadmaņana;
		}
		promedioedad1 = totaledadmaņana / aux1;

		System.out.println("Edades de los estudiantes de horario de tarde");
		int aux2 = numestTarde;
		for (numestTarde = 60; numestTarde != 0; numestTarde--) {
			System.out.print("Introduzca un edad: ");
			edadtarde = scanner.nextInt();
			totaledadtarde += edadtarde;
		}
		promedioedad2 = totaledadtarde / aux2;

		System.out.println("Edades de los estudiantes de horario de noche");
		int aux3 = numestMaņana;
		for (numestNoche = 110; numestNoche != 0; numestNoche--) {
			System.out.print("Introduzca un edad: ");
			edadnoche = scanner.nextInt();
			totaledadnoche += edadnoche;
		}
		promedioedad3 = totaledadnoche / aux3;

		if (promedioedad1 < promedioedad2) {
			if (promedioedad2 < promedioedad3) {
				System.out
						.println("El mayor promedio es de los estudiantes de horario de noche");
			} else {
				System.out
						.println("El mayor promedio es de los estudiantes de horario de tarde");
			}
		} else if (promedioedad1 > promedioedad2) {
			if (promedioedad1 < promedioedad3) {
				System.out
						.println("El mayor promedio es de los estudiantes de horario de noche");
			} else {
				System.out
						.println("El mayor promedio es de los estudiantes de horario de maņana");
			}
		}
	}
}