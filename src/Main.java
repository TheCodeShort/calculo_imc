public class Main {
	public static void main(String[] args) {

		/*creamos una objeto (una instancia es la clase Paciente)
		* al instanciarlo el constructor me pedirá los datos*/
		Persona pedro = new Persona("pedro", 50, 90);
		Paciente juan = new Paciente("juan", 18, 18, "HIST-001");


		/*ahora traemos el metodo que calculo que heredo de Persona*/
		CalculadoraImc cal = new CalculadoraImc();

		double imcPersona = cal.calculo(pedro);
		double imcPaciente = cal.calculo(juan);

		//ahora usar el propio metodo de la clase Paciente

	    System.out.println("IMC Persona: " + imcPersona);
	    System.out.println("IMC Paciente: " + imcPaciente);


	}
}
