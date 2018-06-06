import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String marca = null, matricula = null, modelo = null, compañia = null;
		int dni = 0, cilindrada = 0, plazas = 0;
		boolean electrico = false;
		Coche coche = new Coche(matricula, marca, modelo, dni, electrico);
		Autobus autobus = new Autobus(matricula, marca, modelo, plazas, compañia);
		Moto moto = new Moto(matricula, marca, modelo, cilindrada);
		int filas = 5, columnas = 10;
		char[][] parking = new char[filas][columnas];
		int opcion, fila = 0, columna = 0;
		Scanner teclado = new Scanner(System.in);
		inicializarParking(parking, filas, columnas);
		int recCoche = 0, recAutobus = 0, recMoto = 0;
		do {
			System.out.println("1. Ver el parking.");
			System.out.println("2. Entrada de un coche.");
			System.out.println("3. Entrada de una moto.");
			System.out.println("4. Entrada de un autobús.");
			System.out.println("5. Salida de un vehículo.");
			System.out.println("6. Ver recaudación.");
			System.out.println("7. Salir del programa.");
			System.out.println();
			System.out.println("Introduce opcion: ");
			opcion = teclado.nextInt();

		
			switch (opcion) {
			
			case 1:
				imprimirParking(parking, filas, columnas);
				break;
			case 2:
				if (comprarCochePlaza(parking, fila, columna, teclado, coche)) {
					recCoche+=5;
				}
				break;
			case 3:
				if(comprarMotoPlaza(parking, fila, columna, teclado, moto)) {
					recMoto+=3;
				}
				break;
			case 4:
				if(comprarAutobusPlaza(parking, fila, columna, teclado, autobus)){
					recAutobus += 10;
				}
				break;
			case 5:
				retiradaPlaza(parking, fila, columna, teclado);
				break;
			case 6:
				System.out.println("Recaudacion de coche: " + recCoche + "€");
				System.out.println("Recaudacion de moto: " + recMoto + "€");
				System.out.println("Recaudacion de auutobus: " + recAutobus + "€");
				System.out.println("Recaudacion total: " + recAutobus+recCoche+recMoto + "€");
				break;
			case 7:
				break;
			default:
				System.out.println("Introduce otra opcion.");
				break;
			}
		} while (opcion != 7);
	}

	private static void retiradaPlaza(char[][] parking, int fila, int columna, Scanner teclado) {
		// TODO Auto-generated method stub
		try {
			System.out.println("introduzca fila: ");
			fila = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			columna = teclado.nextInt();
			if (parking[fila][columna] == 'C' || parking[fila][columna] == 'A' || parking[fila][columna] == 'M') {
				parking[fila][columna] = '0';
				System.out.println("Plaza retirada con exito");
			} else
				System.out.println("Esta plaza esta ocupada o no existe como tal");
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras raras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Has introudcido numeros de mas");
		}
	}

	private static boolean comprarAutobusPlaza(char[][] parking, int fila, int columna, Scanner teclado, 
			Autobus autobus) {
		// TODO Auto-generated method stub
		boolean comprado = false;
		try {
			System.out.println("introduzca fila: ");
			fila = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			columna = teclado.nextInt();
			if (parking[fila][columna] == 'X' || parking[fila][columna] == 'P' || parking[fila][columna] == 'E'
					|| parking[fila][columna] == 'S' || parking[fila][columna] == 'C' || parking[fila][columna] == 'A'
					|| parking[fila][columna] == 'M') {
				if (parking[fila][columna] == 'X')
					System.out.println("Esta es la esquina.");
				if (parking[fila][columna] == 'X')
					System.out.println("Esta es la pared.");
				if (parking[fila][columna] == 'E')
					System.out.println("Esta es la entrada.");
				if (parking[fila][columna] == 'S')
					System.out.println("Esta es la salida.");
				if (parking[fila][columna] == 'C')
					System.out.println("Aqui hay un coche");
				if (parking[fila][columna] == 'A')
					System.out.println("Aqui hay un autobus");
				if (parking[fila][columna] == 'M')
					System.out.println("Aqui hay una moto");
			} else {
				parking[fila][columna] = 'A';
				System.out.println("Matricula:");
				autobus.matricula = teclado.next();
				System.out.println("Marca:");
				autobus.marca = teclado.next();
				System.out.println("Modelo:");
				autobus.modelo = teclado.next();
				System.out.println("Plazas");
				autobus.plazas = teclado.nextInt();
				System.out.println("Compañia: ");
				autobus.compañia = teclado.next();
				comprado =  true;
			}

		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("No introduzca palabras.");
		}
		return comprado;
	}

	private static boolean comprarMotoPlaza(char[][] parking, int fila, int columna, Scanner teclado, 
			Moto moto) {
		// TODO Auto-generated method stub
		boolean comprado = false;
		try {
			System.out.println("introduzca fila: ");
			fila = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			columna = teclado.nextInt();
			if (parking[fila][columna] == 'X' || parking[fila][columna] == 'P' || parking[fila][columna] == 'E'
					|| parking[fila][columna] == 'S' || parking[fila][columna] == 'C' || parking[fila][columna] == 'A'
					|| parking[fila][columna] == 'M') {
				if (parking[fila][columna] == 'X')
					System.out.println("Esta es la esquina.");
				if (parking[fila][columna] == 'X')
					System.out.println("Esta es la pared.");
				if (parking[fila][columna] == 'E')
					System.out.println("Esta es la entrada.");
				if (parking[fila][columna] == 'S')
					System.out.println("Esta es la salida.");
				if (parking[fila][columna] == 'C')
					System.out.println("Aqui hay un coche");
				if (parking[fila][columna] == 'A')
					System.out.println("Aqui hay un autobus");
				if (parking[fila][columna] == 'M')
					System.out.println("Aqui hay una moto");
			} else {
				parking[fila][columna] = 'M';
				System.out.println("Matricula:");
				moto.matricula = teclado.next();
				System.out.println("Marca:");
				moto.marca = teclado.next();
				System.out.println("Modelo:");
				moto.modelo = teclado.next();
				System.out.println("Cilindrada: ");
				moto.cilindrada = teclado.nextInt();
				comprado = true;
			}

		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("No introduzca palabras.");
		}
		return comprado;
	}

	private static boolean comprarCochePlaza(char[][] parking, int fila, int columna, Scanner teclado, Coche coche) {
		// TODO Auto-generated method stub
		boolean comprado = false;
		try {
			System.out.println("introduzca fila: ");
			fila = teclado.nextInt();
			System.out.println("Introduzca columna: ");
			columna = teclado.nextInt();
			if (parking[fila][columna] == 'X' || parking[fila][columna] == 'P' || parking[fila][columna] == 'E'
					|| parking[fila][columna] == 'S' || parking[fila][columna] == 'C' || parking[fila][columna] == 'A'
					|| parking[fila][columna] == 'M') {
				if (parking[fila][columna] == 'X')
					System.out.println("Esta es la esquina.");
				if (parking[fila][columna] == 'X')
					System.out.println("Esta es la pared.");
				if (parking[fila][columna] == 'E')
					System.out.println("Esta es la entrada.");
				if (parking[fila][columna] == 'S')
					System.out.println("Esta es la salida.");
				if (parking[fila][columna] == 'C')
					System.out.println("Aqui hay un coche");
				if (parking[fila][columna] == 'A')
					System.out.println("Aqui hay un autobus");
				if (parking[fila][columna] == 'M')
					System.out.println("Aqui hay una moto");
			} else {
				parking[fila][columna] = 'C';
				System.out.println("Matricula:");
				coche.matricula = teclado.next();
				System.out.println("Marca:");
				coche.marca = teclado.next();
				System.out.println("Modelo:");
				coche.modelo = teclado.next();
				System.out.println("DNI");
				coche.dni = teclado.nextInt();
				// System.out.println("Es electrico:");
				// coche.electrico = teclado.hasNext();
				comprado = true;
			}

		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("No introduzca palabras.");
		}
		return comprado;
	}

	private static void imprimirParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				System.out.print(parking[f][c]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void inicializarParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				parking[f][c] = 'R';
				if ((f == 0 && c == 0) || (f == 0 && c == 9) || (f == 4 && c == 0) || (f == 4 && c == 9)
						|| (f == 2 && c == 0))
					parking[f][c] = 'X';
				if ((f == 0 && c >= 1 && c < 9) || (f == 4 && c >= 1 && c < 9) || (f >= 1 && f < 4 && c == 9))
					parking[f][c] = 'P';
				if (f == 1 && c == 0)
					parking[f][c] = 'E';
				if (f == 3 && c == 0)
					parking[f][c] = 'S';
				if (f >= 1 && f < 4 && c >= 1 && c < 8)
					parking[f][c] = '0';
			}
		}

	}
}