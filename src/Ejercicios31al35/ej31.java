package Ejercicios31al35;

import java.util.Scanner;

public class ej31 {
	public static void main(String[] args) {
		int a, positivo = 0, negativo = 0, multquince = 0, sumadepares = 0;
		Scanner scanner = new Scanner(System.in);
		for (int contador = 10; contador != 0; contador--) {
			System.out.print("Introduzca un numero: ");
			a = scanner.nextInt();
			
			if (a>0)
				positivo++;
			else if (a<0)
				negativo--;
			
			if (a % 15 == 0)
				multquince++;
			
			if (a % 2 == 0)
				sumadepares += a;
			
		}
		System.out.println("Numeros positivos: " + positivo);
		System.out.println("Numeros negativos: " + negativo);
		System.out.println("Multiplos de 15: " + multquince);
		System.out.println("Suma de los pares: " + sumadepares);
		
		
	}
}
