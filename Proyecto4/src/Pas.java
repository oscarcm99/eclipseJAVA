
public class Pas extends Persona {
int numeroHoras;

public Pas(String nombre, String apellidos, int edad, char sexo, int numeroHoras) {
	super(nombre, apellidos, edad, sexo);
	this.numeroHoras = numeroHoras;
}

public int getNumeroHoras() {
	return numeroHoras;
}

public void setNumeroHoras(int numeroHoras) {
	this.numeroHoras = numeroHoras;
}

@Override
public String toString() {
	return "Pas [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + ", numeroHoras="
			+ numeroHoras + "]";
}

}
