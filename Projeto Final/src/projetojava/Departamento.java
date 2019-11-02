package projetojava;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends Empresa {
	private static int codigo = 0;
	private String nomeDep;
	private static int codigoFun = 0;
	private String nomeFun;
	private String emailFun;
	private String cpfFun;
	private String dependentesFun;
	private String nomeDepend;
	private String funDep;
	
	List<String> funcionarios = new ArrayList<String>();
	List<String> dependentes = new ArrayList<String>();
	
	public Departamento() {
		this.codigo++;
		this.codigoFun = 0;
	}

	public static int getCodigo() {
		return codigo;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nome) {
		this.nomeDep = nome;
	}
	
	public void setFuncionario(String nome, String email, String cpf) {
		this.funcionarios.add(nome);
		this.codigoFun++;
		this.nomeFun = nome;
		this.emailFun = email;
		this.cpfFun = cpf;
		
	}
	
	public void getFuncionarios() {
		for (String string : funcionarios) {
			System.out.println(string);
		}
	}

	public static int getCodigoFun() {
		return codigoFun;
	}
	
	public void setDependente(String fun, String nome) {
		if(funcionarios.contains(fun)) {
			dependentes.add(fun);
			dependentes.add(nome);
		}else {
			System.out.println("Funcionário não existe para por dependente.");
		}
	}
	
	public void getDependente(String fun) {
		int i = 0;
		String fun2 = fun;
		for (String string : dependentes) {
			if(i == 1) {
				System.out.println("Dependente de " + fun2 + " é " + string);
				i = 2;
			}
			if(string == fun2) {
				i = 1;
			}
		}
		if(i != 2) {
			System.out.println("Nada encontrado.");
		}
	}
}
