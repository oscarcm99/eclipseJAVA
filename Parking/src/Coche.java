//Clase hija
public class Coche extends Vehiculo {
	int dni;//Ambos atributos
	boolean electrico;
//Constructor
	public Coche(String matricula, String marca, String modelo, int dni, boolean electrico) {
		super(matricula, marca, modelo);//Constructor que se añade los datos del padre mas lo de la hija
		this.dni = dni;
		this.electrico = electrico;
	}
//Getters and setters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
//Metodo toString
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", dni=" + dni
				+ ", electrico=" + electrico + "]";
	}

}
