package proyecto1;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos de variables conocidas
		int numero1 = 0;
		int numero2 = 10;
		double decimal = 9.5;
		char caracter = 'o';
		String cadena = "Oscar";
		boolean abc = true;
		String alumno = "albornoz";
		int contador;
		int con;
		
		System.out.println("Numero entero: " +numero1
							+  "\n"+
						   "Decimal: " +decimal +"\n"+
						   "Caracter: " +caracter + "\n"+
						   "Cadena de caracteres: " +cadena +"\n" +
						   "Bool: " +abc);
	
		
		//Condicional simple
		if(numero1 > 5 || numero2 <= 13) {
			System.out.println("Es mayor que 0.");
		}else {
			if(numero1 == 0) {
			System.out.println("Es igual que 0.");
			}else {
				System.out.println("Es menor que 0.");
			}
		}
		
		//Condicional multiple
	switch(numero1){
	case 0:
		System.out.println("Soy 0");
		break;
	case 1:
		System.out.println("Soy 1");
		break;
	case 2:
		System.out.println("Soy 2");
		break;
	default:
		System.out.println("No soy real");
		break;
		}	
;
	
	//Estructuras repetitivas
	for(int i = 0; i<alumno.length(); i++) {
		char letra = alumno.charAt(i);
		System.out.println(letra);
	}
	contador = 0;
	while(contador<=15) {
		System.out.println("\n" +contador);
		contador++;
	}
	con = 0;
	do {
		System.out.println("Estoy fuera");
		con++;
	}while(con <=5);
	}
	
}
