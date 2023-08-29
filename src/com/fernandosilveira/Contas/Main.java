package com.fernandosilveira.Contas;

public class Main {

	public static void main(String[] args) {
		
		Contas conta = new Contas();
		
		conta.numero = 119755;
		conta.nome = "Fernando";
		conta.saldo = 3455.65;
		conta.limite = 5000;
		
		System.out.println("Correntista: " + conta.nome);
		System.out.println("Conta Corrente: " + conta.numero);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Limita: " + conta.limite);
		System.out.println("");
		
		Contas conta2 = new Contas(121212, "Jose", 1235.5, 2000);
		
		System.out.println("Correntista: " + conta2.nome);
		System.out.println("Conta Corrente: " + conta2.numero);
		System.out.println("Saldo: " + conta2.saldo);
		System.out.println("Limita: " + conta2.limite);
	}
	
}
