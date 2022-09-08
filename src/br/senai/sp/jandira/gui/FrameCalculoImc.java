package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;


public class FrameCalculoImc {
	
	public String titulo;
	public int altura;
	public int largura;
	
	public void criarTela () {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.getContentPane().setBackground(Color.white);
		
		//pegar container para colocar componentes dentro dele
		Container painel = tela.getContentPane();
		
		
		//criar os componentes que serão colocados no container(tela)
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("IMC");
		labelTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		labelTitulo.setForeground(Color.DARK_GRAY);
		labelTitulo.setBounds(30, 10, 50, 30);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(30, 60, 100, 30);		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 85, 260, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso: ");
		labelPeso.setBounds(30, 135, 100, 30);
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 160, 100, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(30, 210, 100, 30);
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 235, 100, 30);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data Nasc.: ");
		labelDataNascimento.setBounds(30, 285, 100, 30);
		JTextField textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setBounds(30, 310, 100, 30);
		
		JLabel labelImc = new JLabel();
		labelImc.setText("Seu IMC ... ");
		labelImc.setBounds(30, 350, 100, 30);
		
		JLabel labelStatus = new JLabel();
		labelStatus.setText("Seu Status IMC é ... ");
		labelStatus.setBounds(30, 385, 100, 30);
		
		JLabel labelIdade = new JLabel();
		labelIdade.setText("Sua idade é ... ");
		labelIdade.setBounds(30, 420, 100, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBackground(Color.PINK);
		buttonCalcular.setBounds(160, 310, 100, 30);
		
		//colocar os componentes no container
		painel.add(labelTitulo);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelDataNascimento);
		painel.add(textFieldDataNascimento);
		painel.add(labelImc);
		painel.add(labelStatus);
		painel.add(labelIdade);
		painel.add(buttonCalcular);
		
		tela.setVisible(true);
		
		//botão runfando
		buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Integer.parseInt(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText()); 
				
				labelImc.setText(String.format("%.2f", cliente.getImc()));
				labelStatus.setText(cliente.getStatusImc());
				
				//idade do cliente
				String[] data = textFieldDataNascimento.getText().split("/");
				int dia = Integer.parseInt(data[0]);
				int mes = Integer.parseInt(data[1]);
				int ano = Integer.parseInt(data[2]);
				cliente.dataNascimento = LocalDate.of(ano, mes, dia);
				labelIdade.setText("Sua idade é: " + cliente.getIdade() + "anos.");
			}
		});		
	}
	
}
