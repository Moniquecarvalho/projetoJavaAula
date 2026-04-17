package desafio01;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;

        System.out.println("Salário: ");
        salario = leia.nextFloat();

        System.out.println("Abono: ");
        abono = leia.nextFloat();

        novoSalario = salario + abono;

        System.out.println("Novo Salário: " + novoSalario);

	}

}
