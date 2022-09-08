package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		
		tela.titulo = "Calculadora IMC";
		tela.altura = 500;
		tela.largura = 350;
		tela.criarTela();
		
//		FrameCalculoImc tela2 = new FrameCalculoImc();
//		
//		tela2.titulo = "turma do barulho";
//		tela2.altura = 400;
//		tela2.largura = 400;
//		tela2.criarTela();
		
//		Cliente alonso = new Cliente();
		
//		alonso.nome = "Alonso da Silva";
//		alonso.peso = 80;
//		alonso.altura = 1.77;
//		alonso.dataNascimento = LocalDate.of(1996, 2, 29);
//		
//		//System.out.println(alonso.getImc());
		
//		Cliente maria = new Cliente();
//		
//		maria.nome = "Maria da Silva";
//		maria.peso = 78;
//		maria.altura = 1.60;
//		maria.dataNascimento = LocalDate.of(2000, 1, 10);
//		
//		if (maria.getIdade() >= 21) {
//			System.out.printf("%s está autorizada, já tem %s anos de idade.\n", maria.nome, maria.getIdade());
//		} else {
//			System.out.println("Não pode participar!!\n");
//		}
//		
//		System.out.println(maria.getIdade());
//
//		System.out.println(maria.getImc());
//		
//		System.out.println(maria.getStatusImc());
		
		
	}

}
