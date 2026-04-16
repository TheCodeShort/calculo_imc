package model;

public class Persona implements Calculable {
		/*atributos y se usa private para encapsular y que nadie las toque de afuera*/
		/*ejemplo => alguien cambia el peso a -50*/
	private String nombre;
	private double peso;
	private  double altura;

	/*constructor metodo que construye el objeto*/
	public Persona(String nombre, double peso, double altura){
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public double getAltura() {
		return altura;
	}


}
