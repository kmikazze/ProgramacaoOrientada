package funcionario;

public class Funcionario {
	private String nome;
	private String sexo;
	private String setor;
	private float salario;
	private int idade;
	
	public Funcionario(String nome, String sexo, String setor, float salario, int idade) {

		this.nome = nome;
		this.sexo = sexo;
		this.setor = setor;
		this.salario = salario;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void visualizar() {
		System.out.println("============================================");
		System.out.println("Nome do funcionário: "+nome);
		System.out.println("Sexo: "+sexo);
		System.out.println("Idade: "+idade);
		System.out.println("Função: "+setor);
		System.out.println("Salário: "+salario+"00,00");
		System.out.println("============================================");
	}
}
