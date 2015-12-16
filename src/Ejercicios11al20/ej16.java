package Ejercicios11al20;

import java.util.Scanner;

public class ej16 {
	public static void main(String[] args) {
		int altura = 0, sumalturas = 0, numpersonas, aux;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero de personas: ");
		numpersonas = scanner.nextInt();

		aux = numpersonas;

		while (aux != 0) {
			System.out.print("Introduzca una altura: ");
			altura = scanner.nextInt();
			sumalturas = sumalturas + altura;
			aux--;
		}
		System.out.println("El promedio de altura de estas personas es de: "
				+ (sumalturas / numpersonas));
	}
}