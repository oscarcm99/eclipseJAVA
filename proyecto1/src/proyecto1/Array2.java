package proyecto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.println("introduce: " +i);
			lista.add(teclado.next());
		}
		lista.remove(5);
		for(int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
