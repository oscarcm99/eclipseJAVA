

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		int filas = 10, columnas = 10;
		int[][] sala = new int[filas][columnas];
		int fila = 0, columna = 0;
		Scanner teclado = new Scanner(System.in);
		inicilizarMatriz(sala, filas, columnas);

		do {
			System.out.println("1. Ver sala del cine.");
			System.out.println("2. Comprar una entrada.");
			System.out.println("3. Devolver entrada.");
			System.out.println("4. Salir.");
			System.out.println();
			System.out.println("Introduzca opción: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				imprimirMatriz(sala, filas, columnas);
				break;
			case 2:
				comprarEntradas(sala,fila,columna,teclado);
				break;
			case 3:
				devolverEntrada(sala,fila,columna,teclado);
				break;
			case 4:
				break;
			default:
				System.out.println("Introduzca otra opción.");
				break;
			}
		} while (opcion != 4);
	}

	private static void devolverEntrada(int[][] sala, int fila, int columna, Scanner teclado) {
		// TODO Auto-generated method stub
		try {
			System.out.println("introduzca fila: ");
			fila = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			columna = teclado.nextInt();
			
			if((sala[fila][columna] == 8) || (sala[fila][columna] == 0 ))
				if(sala[fila][columna] == 8)
					System.out.println("No hay butaca porque es pasillo.");
				else
					System.out.println("Esta butaca no esta comprada.");
			else
				sala[fila][columna] = 0;
		}catch(InputMismatchException error) {
			System.out.println("No introduzca palabras raras.");
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Has introudcido numeros de mas");
		}
	}

	private static void comprarEntradas(int[][] sala, int fila, int columna, Scanner teclado) {
		// TODO Auto-generated method stub
		try {
			System.out.println("introduzca fila: ");
			fila = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			columna = teclado.nextInt();
			
			if((sala[fila][columna] == 8) || (sala[fila][columna] == 1 ))
				if(sala[fila][columna] == 8)
					System.out.println("No hay butaca porque es pasillo.");
				else
					System.out.println("Esta butaca esta ocupada.");
			else
				sala[fila][columna] = 1;
		}catch(InputMismatchException error) {
			System.out.println("No introduzca palabras raras.");
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Has introudcido numeros de mas");
		}
	}

	private static void imprimirMatriz(int[][] sala, int filas, int columnas) {
		// TODO Auto-generated method stub
        for(int f=0; f<filas; f++) {
        	for(int c=0; c<columnas; c++) {
        		System.out.print(sala[f][c] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
	}

	private static void inicilizarMatriz(int[][] sala, int filas, int columnas) {
		// TODO Auto-generated method stub
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				if (c == 4 || c == 5)
					sala[f][c] = 8;
				else
					sala[f][c] = 0;
			}
		}
	}

}