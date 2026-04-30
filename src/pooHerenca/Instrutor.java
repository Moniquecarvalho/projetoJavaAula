package pooHerenca;

public class Instrutor extends Pessoa {

	//Atributos
	private String especialidade;

	//Métodos Construtor
	public Instrutor(String nome, int idade, String email, String especialidade) {
		
		super(nome, idade, email);
		this.especialidade = especialidade;
	}

	//Método de Acesso - o Get = Pega ou Mostra
 	//                 - o Set = 

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
