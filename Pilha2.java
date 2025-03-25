package atividadejava09;

import java.util.Scanner;
import java.util.Stack;

public class Pilha2 {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<String>();
		String livro;
		int opcao;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("********************************************************************\n");
			System.out.println("1 - ADICIONAR LIVRO NA PILHA");
			System.out.println("2 - LISTAR TODOS OS LIVROS");
			System.out.println("3 - RETIRAR LIVRO DA PILHA");
			System.out.println("0 - SAIR");
			System.out.println("\n********************************************************************\n");
			System.out.println("ENTRE COM A OPÇÃO DESEJADA: \n");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome:\n");
				livro = scanner.nextLine();
				pilhaLivros.push(livro);
				System.out.println("Pilha:\n" + "\n" + pilhaLivros + "\n" + "\nLivro adicionado!");
				break;

			case 2:
				for (String string : pilhaLivros) {
					System.out.println(string);
				}
				break;

			case 3:

				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia!");
					break;

				} else {
					String livroRetirado = pilhaLivros.pop();
					System.out.println("\nUm livro foi retirado da pilha!" + "\n" + livroRetirado);
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!\n");
				break;

			}

		} while (opcao != 0);
		scanner.close();

	}

}
