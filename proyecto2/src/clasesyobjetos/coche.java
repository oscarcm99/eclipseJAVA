package clasesyobjetos;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class coche {
	// 1. Definir los atributos
	String matricula;
	String marca;
	String modelo;
	int año;
	String color;
	double precio;
	char motor; // D Diesel G Gasoil H Hibrido
	boolean itv;// True La ha pasado false no la pasa
	// 2. Implementar metodo constructor publico y con mismo nombre

	public coche(String matricula, String marca, String modelo, int año, String color, double precio, char motor, 
			boolean itv) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.precio = precio;
		this.motor = motor;
		this.itv = itv;
	}
	// 3. Metodos getters and setters get me sirve para obtener valor de cada atributo set para cambiarlo

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getMotor() {
		return motor;
	}

	public void setMotor(char motor) {
		this.motor = motor;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	@Override
	// 4. Metodo to string
	public String toString() {
		return "coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color="
				+ color + ", precio=" + precio + ", motor=" + motor + ", itv=" + itv + "]";
	}
	//5. Implementar metodos
	public double precioIva(){
		return getPrecio() * 1.21;
	}
		
	public int añoCoche() {
		Calendar fecha = new GregorianCalendar();
		int añoCurso = fecha.get(Calendar.YEAR);
		return añoCurso - getAño();
	}
	
}
