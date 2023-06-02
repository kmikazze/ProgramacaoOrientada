package funcionario;

public class TestaFuncionário {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Camila Ramos","Fem","Desenvolvedora",4.000f,23);
		Funcionario f2 = new Funcionario("Barbara Lazana","Fem","Desenvolvedora",4.000f,20);
		
		f1.visualizar();
		f2.visualizar();
	}

}
