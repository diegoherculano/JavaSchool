package projetojava;

public class ProjetoMain {
	public static void main(String[] args) {
		Departamento carajas = new Departamento();
		carajas.setNome("Carajas");
		carajas.setCNPJ("987654321");
		carajas.setEndereco("R. Morfo", "321", "Bessa", "Joao Pessoa");
		carajas.setNomeDep("Eletronicos");
		carajas.setFuncionario("Carlos Vasco", "car@gmail.com", "99911122292");
		carajas.setFuncionario("Maria Cruzeiro", "mar@gmail.com", "32132132133");
		System.out.println(carajas.getCodigoFun());
		carajas.getFuncionarios();
		carajas.setDependente("Carlos Vasco", "Larissa Flamengo");
		carajas.setDependente("Maria Cruzeiro", "Valdo Botafogo");
		carajas.getDependente("Carlos Vasco");
		carajas.getDependente("Maria Cruzeiro");
		System.out.println("Número de funcionários Carajas: " + carajas.getCodigoFun());
		
		Departamento americanas = new Departamento();
		americanas.setNome("Lojas Americanas");
		americanas.setCNPJ("821937129");
		americanas.setEndereco("Rua das Gracas", "999", "Vila Olimpia", "Cabedelo");
		americanas.setNomeDep("Eletrodomesticos");
		americanas.setFuncionario("Douglas Costas", "dou@gmail.com", "32131231321");
		americanas.setFuncionario("Robinho da Silva", "rob@gmail.com", "3781273815");
		americanas.getFuncionarios();
		americanas.setDependente("Robinho da Silva", "Maria Eduarda");
		americanas.setDependente("Douglas Costas", "Maicon Leite");
		americanas.getDependente("Robinho da Silva");
		americanas.getDependente("Douglas Costas");
		System.out.println("Número de funcionários na Americanas: " + americanas.getCodigo());
		System.out.println("Empresas cadastradas no sistema: " + americanas.getCodigo());
		for (String string : americanas.funcionarios) {
			System.out.println(string);
		}
		
	}

}
