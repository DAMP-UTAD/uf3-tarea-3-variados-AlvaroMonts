package Ejercicios31al35;

import java.util.Scanner;

public class ej32 {
	public static void main(String[] args) {
		int numestMa�ana = 50, numestTarde = 60, numestNoche = 110; // contadores
																	// de
																	// estudiantes
		int edadma�ana, edadtarde, edadnoche; // edades que se introducen
		int totaledadma�ana = 0, totaledadtarde = 0, totaledadnoche = 0; // suma
																			// de
																			// edades
		int promedioedad1, promedioedad2, promedioedad3; // promedios
		Scanner scanner = new Scanner(System.in);

		System.out.println("Edades de los estudiantes de horario de ma�ana");
		int aux1 = numestMa�ana;
		for (numestMa�ana = 50; numestMa�ana != 0; numestMa�ana--) {
			System.out.print("Introduzca un edad: ");
			edadma�ana = scanner.nextInt();
			totaledadma�ana += edadma�ana;
		}
		promedioedad1 = totaledadma�ana / aux1;

		System.out.println("Edades de los estudiantes de horario de tarde");
		int aux2 = numestTarde;
		for (numestTarde = 60; numestTarde != 0; numestTarde--) {
			System.out.print("Introduzca un edad: ");
			edadtarde = scanner.nextInt();
			totaledadtarde += edadtarde;
		}
		promedioedad2 = totaledadtarde / aux2;

		System.out.println("Edades de los estudiantes de horario de noche");
		int aux3 = numestMa�ana;
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
						.println("El mayor promedio es de los estudiantes de horario de ma�ana");
			}
		}
	}
}