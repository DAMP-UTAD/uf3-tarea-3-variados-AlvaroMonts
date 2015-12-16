package Ejercicios1al10;

import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a = scanner.nextInt();
		
		if (a>0)
			System.out.println("Es positivo");
		else if (a<0)
			System.out.println("Es negativo");
		else 
			System.out.println("Es cero");
	}
}