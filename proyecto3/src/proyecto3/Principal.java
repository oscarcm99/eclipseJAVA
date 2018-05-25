package proyecto3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas = 10, columnas = 10;
		int fila = 0, columna = 0;
		int[][] matriz = new int[filas][columnas];
		Scanner teclado = new Scanner(System.in);

		inicializarMatriz(matriz, filas, columnas);
		imprimirMatriz(matriz, filas, columnas);
		comprarEntradas(matriz, fila, columna, teclado);
		imprimirMatriz(matriz, filas, columnas);

	}

	private static void comprarEntradas(int[][] matriz, int i, int j, Scanner teclado) {
		// TODO Auto-generated method stub
		try {
			System.out.println("introduzca filla: ");
			i = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			j = teclado.nextInt();

			if ((matriz[i][j] == 8) || (matriz[i][j] == 1))
				if (matriz[i][j] == 8)
					System.out.println("Butaca es pasillo.");
				else
					System.out.println("Butaca ocupada.");
			else {
				matriz[i][j] = 1;
			}
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras raras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Has introudcido numeros de mas");
		}

	}

	private static void imprimirMatriz(int[][] matriz, int filas, int columnas) {
		// TODO Auto-generated method stub
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				System.out.print(matriz[f][c] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void inicializarMatriz(int[][] matriz, int filas, int columnas) {
		// TODO Auto-generated method stub
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				if (c == 4 || c == 5)
					matriz[f][c] = 8;
				else
					matriz[f][c] = 0;
			}

		}
	}

}
