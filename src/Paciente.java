/*Paciente hereda de la clase Persona*/
public class Paciente extends Persona{
	/*Recordando podemos poner nuevos atributos*/
	private String numeroHistorial;

	//constructor de la subclase Paciente
	public Paciente(String nombre, double peso, double altura, String numeroHistorial){
		//super se llama al constructor de la clase (Persona)
		super(nombre, peso, altura);
		this.numeroHistorial = numeroHistorial;
	}

	public  String  getNumeroHistorial(){
		return numeroHistorial;
	}

}
