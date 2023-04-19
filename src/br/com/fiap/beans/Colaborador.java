package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private double valorHora;
	private String cargo;
	
	private double qntHoras;
	private double percentual;
	
	// CONSTRUCTOR
	public Colaborador() {
		super();
	}
	public Colaborador(String nome, double valorHora, String cargo, double qntHoras, double percentual) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		this.qntHoras = qntHoras;
		this.percentual = percentual;
	}

	// GET & SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getQntHoras() {
		return qntHoras;
	}
	public void setQntHoras(double qntHoras) {
		this.qntHoras = qntHoras;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	
	
	// GET ALL
	public String getAll() {
		return "Nome: " + nome + "\nValorHora: R$" + valorHora + "\nCargo: " + cargo;
	}

	// WORKER
	public double calcularSalario() {
		return valorHora * qntHoras;
	}
	
	public double calcularIr() {
		double salario;
		salario = calcularSalario() * percentual/100;
		return salario;
	}
}
