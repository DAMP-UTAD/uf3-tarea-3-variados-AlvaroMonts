package Ejercicios31al35;

public class ej35 {
	public static void main(String[] args) {
		int numero = 0;
		int numDeNum = 0;
		for (int a = 0; a < 5; a++) {
			while (numDeNum < 5) {
				numero++;
				System.out.print(numero + " ");
				numDeNum++;
			}
			System.out.println();
			numDeNum -= 5;
		}
	}

}
