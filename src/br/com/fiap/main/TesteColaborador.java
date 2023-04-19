package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;

public class TesteColaborador {
	public static void main(String[] args) {
		Colaborador objColaborador = new Colaborador(
				JOptionPane.showInputDialog("Digite o seu nome:"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora:")),
				JOptionPane.showInputDialog("Digite o seu cargo:"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade de horas:")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual:"))
		);
		
		System.out.println("Informações do Colaborador\n");
		System.out.println(objColaborador.getAll());
		System.out.println("\n======");
		System.out.println("Salário");
		System.out.println(objColaborador.calcularSalario());
		System.out.println("===");
		System.out.println("Imposto de Renda");
		System.out.println(objColaborador.calcularIr());
	}
}
