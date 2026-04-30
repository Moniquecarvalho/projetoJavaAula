package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		//Instanciamento | Instanciar um objeto
		Carro c1 = new Carro("Kombi", 4, 4, "XPTO");
		
		//c1.marca  = "Kombi";
		//c1.portas = 4;
		c1.setMarca("Kombi");
		c1.setPortas(4);
		
		c1.locomover();
		
		System.out.println(" Marca: " + c1.getMarca());
		System.out.println(" Qtd de portas: " + c1.getPortas());
		
		System.out.println(c1.parar());
		
	}

}
