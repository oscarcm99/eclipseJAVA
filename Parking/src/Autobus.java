//Clase hija
public class Autobus extends Vehiculo {
	//Atributos
	int plazas;
	String compañia;

	public Autobus(String matricula, String marca, String modelo, int plazas, String compañia) {
		super(matricula, marca, modelo);//Constructor donde hereda lo del padre mas lo de la hija
		this.plazas = plazas;
		this.compañia = compañia;
	}
// Getters and setters
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
//Metodo toString
	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", plazas=" + plazas
				+ ", compañia=" + compañia + "]";
	}

}
