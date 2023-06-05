package funcionario;

public class TestaFuncionário {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Camila Ramos","Fem","Desenvolvedora Web",4000.0f,23);
		Funcionario f2 = new Funcionario("Barbara Lazana","Fem","Desenvolvedora Web",4000.0f,20);
		
		f1.visualizar();
		f2.visualizar();
	}

}
