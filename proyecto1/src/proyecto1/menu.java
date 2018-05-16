package proyecto1;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int opcion = 0;
		int num1 = 0, num2 = 0;
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
			switch(opcion) {
			case 1:
				System.out.print("Introduzca el primer numero: ");
				num1 = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("Resultado = "+(num1+num2));
				break;
			case 2:
				System.out.print("Introduzca el primer numero: ");
				num1 = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("Resultado = "+(num1-num2));
				break;
			case 3:
				System.out.print("Introduzca el primer numero: ");
				num1 = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("Resultado = "+(num1*num2));
				break;
			case 4:
				System.out.print("Introduzca el primer numero: ");
				num1 = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("Resultado = "+(num1/num2));
				break;
			case 5:
				System.out.print("Introduzca la base: ");
				num1 = teclado.nextInt();
				System.out.print("Introduzca el exponente: ");
				num2 = teclado.nextInt();
				System.out.println("Resultado = "+(Math.pow(num1, num2));
				break;
			case 6:
				System.out.println("1 RAIZ 1=1");
				break;
			case 7:
				System.out.println("Maximo 1 y 2 es 2");
				break;
			case 8:
				System.out.println("Minimo 1 y 2 es 1");
				break;
			case 9:
				System.out.println("Fuerisima");
				break;
			default:
				System.out.println(":V Mete otro numero");
				break;
			}
		}while(opcion!=9);
	}

}
