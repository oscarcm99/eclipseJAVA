package proyecto1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int opcion = 0;
		double num1 = 0, num2 = 0, resultado;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Menu calculadora");
			System.out.println("----------------------------");
			System.out.println("1. Sumar 2 numeros.");
			System.out.println("2. Restar 2 numeros.");
			System.out.println("3. Multiplicar 2 numeros.");
			System.out.println("4. Dividir 2 numeros.");
			System.out.println("5. Potencia de 2 numeros.");
			System.out.println("6. Raiz de 2 numeros.");
			System.out.println("7. Maximo de 2 numeros.");
			System.out.println("8. Minimo de 2 numeros.");
			System.out.println("9. Salir");
			System.out.print("Introduce opcion: ");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = sumar(num1, num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 2:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = restar(num1,num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 3:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = multiplicar(num1,num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 4:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = dividir(num1,num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 5:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = potencia(num1, num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 6:
				num1 = pedirNumero(teclado);
				resultado =raiz(num1);
				System.out.println("Resultado = " + resultado);
				break;
			case 7:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = maximo(num1, num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 8:
				num1 = pedirNumero(teclado);
				num2 = pedirNumero(teclado);
				resultado = minimo(num1, num2);
				System.out.println("Resultado = " + resultado);
				break;
			case 9:
				System.out.println("Fuerisima");
				break;
			default:
				System.out.println(":V Mete otro numero");
				break;
			}
		} while (opcion != 9);
	}

	private static double pedirNumero(Scanner teclado) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca número: ");
		double num = teclado.nextDouble();
		return num;
	}

	private static double minimo(double num1, double num2) {
		// TODO Auto-generated method stub
		return Math.min(num1, num2);
	}

	private static double maximo(double num1, double num2) {
		// TODO Auto-generated method stub
		return Math.max(num1, num2);
	}

	private static double raiz(double num1) {
		// TODO Auto-generated method stub
		return Math.sqrt(num1);
	}

	private static double potencia(double num1, double num2) {
		// TODO Auto-generated method stub
		return Math.pow(num1, num2);
	}

	private static double dividir(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	private static double multiplicar(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	private static double restar(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	private static double sumar(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
