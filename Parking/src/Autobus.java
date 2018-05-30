
public class Autobus extends Vehiculo{
int plazas;
String compañia;
public Autobus(String matricula, String marca, String modelo, int plazas, String compañia) {
	super(matricula, marca, modelo);
	this.plazas = plazas;
	this.compañia = compañia;
}
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
@Override
public String toString() {
	return "Autobus [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", plazas=" + plazas
			+ ", compañia=" + compañia + "]";
}

}
