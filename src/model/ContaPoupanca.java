package model;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	public ContaPoupanca() {
		super();
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public float calcNovoSaldo(float taxa){
		float saldo = getSaldo() * (1+taxa);
		setSaldo(saldo);
		return getSaldo();
	}
}
