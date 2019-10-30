package projeto03;

public class Conta {
	public String numero;
	public String agencia;
	public double saldo;
	
	public double sacar(double valor) {
		return this.saldo-valor;
	}
	
	public double depositar(double valor) {
		return this.saldo+valor;
	}
	
	public boolean transferir(double valor, Conta conta) {
		if (conta.transferir(valor, conta)) {
			return true;
		}
		return false;
	}
	
	public double saldo(Conta conta) {
		return conta.getSaldo();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
