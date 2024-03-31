package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Contas {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		cp.setConta("João");
		cp.setNumConta(1);
		cp.setSaldo(2000);
		cp.setDiaRendimento(15);
		ContaEspecial ce = new ContaEspecial();
		ce.setConta("Maria");
		ce.setNumConta(2);
		ce.setSaldo(5000);
		ce.setLimite(1500);
		
		cp.sacar(500);
		ce.sacar(500);
		
		cp.sacar(2500);
		
		ce.sacar(5500);
		ce.sacar(15000);
		
		cp.deposito(1500);
		ce.deposito(1500);
		
		System.out.printf("Novo saldo: R$%.2f\n", cp.calcNovoSaldo(0.1f));
		
		System.out.println();
		System.out.printf("Nome do cliente: %s\nNúmero da conta: %d\nSaldo da conta: %.2f\nDia do Rendimento: %d\n",cp.getConta(), cp.getNumConta(), cp.getSaldo(), cp.getDiaRendimento());
		
		System.out.println();
		System.out.printf("Nome do cliente: %s\nNúmero da conta: %d\nSaldo da conta: %.2f\nLimite: %.2f",ce.getConta(), ce.getNumConta(), ce.getSaldo(), ce.getLimite());
		
		
		
		
	}

}
