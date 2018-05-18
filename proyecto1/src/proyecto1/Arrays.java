package proyecto1;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] contactos = new String[6];
		int [] edad = {19,19,26,19,18,20};
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<contactos.length; i++) {
			System.out.println("Introduzca un numero en un contacto en la posicion:" +i);
			contactos[i] = teclado.next();
		}
	}

}
