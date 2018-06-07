//Clase hija
public class Moto extends Vehiculo {
	int cilindrada;//Atributo

	public Moto(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);//Constructor donde hereda los del padre mas lo suyo
		this.cilindrada = cilindrada;
	}
//Getters and setters
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
//Metodo toString
	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ "]";
	}

}
