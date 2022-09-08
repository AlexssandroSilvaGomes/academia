package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	
	public String nome;
	public LocalDate dataNascimento;
	public double altura;
	public double peso;
	
	public double getImc() {
		return peso / Math.pow(altura, 2);
	}
	
	public int getIdade() {
		Period diferenca = Period.between(dataNascimento, LocalDate.now());
		return diferenca.getYears();
	}
	
	public String getStatusImc() {
		if (getImc() <= 18.5) {
			return "Abaixo do peso!";
		} else if (getImc() > 18.5 && getImc() < 25.0) {
			return "peso Ideal.";
		} else if (getImc() >= 25.0 && getImc() < 30.0) {
			return "Levemente acima do peso.";
		} else if (getImc() >= 30.0 && getImc() < 35.0) {
			return "Obesidade grau I.";
		} else if (getImc() >= 35.0 && getImc() < 40.0) {
			return "Obesidade grau II.";
		} else {
			return "Obesiddade grau III.";
		}
	}
}
