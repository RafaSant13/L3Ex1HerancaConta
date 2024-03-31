package model;

public class ContaEspecial extends ContaBancaria{
	
	private float limite;

	public ContaEspecial() {
		super();
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(float valor) {
		if (valor>(getSaldo()+limite)) {
			System.out.printf("Saldo Insuficiente\nSaldo: R$%.2f\nLimite: R$%.2f\n",getSaldo(), limite);
		}
		else {
			float saldo = getSaldo() - valor;
			if (saldo<0) {
				float limite = getLimite() + saldo;
				setLimite(limite);
			}
			setSaldo(saldo);
		}
	}

}
