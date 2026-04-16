package service;

import model.Calculable;

public class CalculadoraImc {

	public double calculo(Calculable objeto) {
		return objeto.getPeso() / (objeto.getAltura() * objeto.getAltura());
	}
}
