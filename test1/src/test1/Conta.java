package test1;

public class Conta {
	private String numero;
	private String operacao;
	private double saldo;

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void transferir(double valor, Conta conta) throws Exce, Er {
		if(getSaldo() >= valor) {
			conta.setSaldo(valor);
		}else {
			throw new Exce("Sem saldo");
		}		
	}
}
