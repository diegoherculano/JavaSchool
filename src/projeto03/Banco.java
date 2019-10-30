package projeto03;

public class Banco {
	public static void main(String args[]) {
		Conta bb = new Conta();
		bb.agencia = "001";
		bb.numero = "123";
		bb.saldo = 1000;
		
		Conta zz = new Conta();
		zz.agencia = "002";
		zz.numero = "321";
		zz.saldo = 1000;
		
		bb.transferir(500, zz);
		double valor = zz.getSaldo();
		System.out.println(valor);
		
	}

}
