package atividadejava09;

import java.util.LinkedList;
import java.util.Scanner;

public class Fila1 {

	public static void main(String[] args) {
		int opcao;

		LinkedList<String> fila = new LinkedList<String>();

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("********************************************************************\n");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("\n********************************************************************\n");
			System.out.println("Entre com a opção desejada: \nßßßßßßßßßßßßßß");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome:\n");
				String nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Fila:\n" + "\n" + nome + "\n" + "\nCliente adicionado!");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!\n");
				} else {
					System.out.println("Lista de Clientes na Fila:\n");
					for (String cliente : fila) {
						System.out.println(cliente);

					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!\n");
				} else {
					fila.poll();
					System.out.println("O cliente foi chamado!\n");
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
