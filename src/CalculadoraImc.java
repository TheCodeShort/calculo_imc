public class CalculadoraImc {

	/*public double calculo(Calculable objeto) {
		return objeto.getPeso() / (objeto.getAltura() * objeto.getAltura());
	}*/

	public double calculo(Persona objeto) {
		return objeto.getPeso() / (objeto.getAltura() * objeto.getAltura());
	}
}
