package clasesyobjetos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coche c1 = new coche("1234JVL","seat", "toledo", 2003, "negro", 24321.12, 'D', true);
		coche c2 = new coche("2123ZPW","bmw", "serie 3", 2012, "rojo", 39432.45, 'D', true);

		System.out.println("Precio: "+c1.precioIva());
		System.out.println("El coche tiene : " +c2.añoCoche() + " años");
	}

}
