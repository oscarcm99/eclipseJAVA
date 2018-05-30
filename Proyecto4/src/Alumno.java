
public class Alumno extends Persona {
	protected boolean becado;
	public Alumno(String nombre, String apellidos, int edad, char sexo, boolean becado) {
		super(nombre, apellidos, edad, sexo);
		// TODO Auto-generated constructor stub
		this.becado = becado;
	}
	protected boolean isBecado() {
		return becado;
	}
	protected void setBecado(boolean becado) {
		this.becado = becado;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
				+ ", becado=" + becado + "]";
	}
	
	

}
