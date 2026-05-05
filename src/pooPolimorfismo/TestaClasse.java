package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		//Pessoa p = new Pessoa("Maria", 18); //Classes abstratas não pode ser instânciada
		//p.visualizar();
		
		TriAtleta t = new TriAtleta("Monique", 39, 450);
		
		t.visualizar();
	}

}
