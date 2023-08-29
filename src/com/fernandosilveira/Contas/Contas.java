package com.fernandosilveira.Contas;

public class Contas {
	
	int numero;
	String nome;
	double saldo;
	double limite;
	

	//metodos:
	public Contas() {} //construtor generico
	
	public Contas(int numero,String nome,double saldo,double limite) { //construtor com parametros
		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		
	}
	
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
}
