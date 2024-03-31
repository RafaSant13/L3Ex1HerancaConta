package model;

import javax.swing.JOptionPane;

public class ContaBancaria {
	
	private String conta;
	private int  numConta;
	private float saldo;

	public ContaBancaria() {
		this.conta = "";
		this.numConta = 0;
		this.saldo = 0;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo < 0) {
			this.saldo = 0;
		}
		else {
			this.saldo = saldo;
		}
		
	}
	
	public void sacar(float valor) {
		if (valor>saldo) {
			System.out.printf("Saldo Insuficiente\nSaldo: R$%.2f%n",saldo);
		}
		else {
			this.saldo = saldo - valor;
		}
	}
	
	public void deposito(float valor) {
		this.saldo = saldo + valor;
	}
	
	

}
