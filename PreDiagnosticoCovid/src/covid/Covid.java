package covid;

import java.util.Scanner;

public class Covid {

	// PROJETO INTEGRAGOR I – A PRÉ-DIAGNÓSTICO DE COVID MAIS DUAS DOENÇAS SIMILARES.
	//CURSO: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
	public static void main(String[] args) {
		// VARIÁVEL
		int opcao = 0;
		String paciente;
		// OBJETO
		Scanner teclado = new Scanner(System.in);
		// ENTRADAS
		System.out.println("***********************************************************");
		System.out.println("*SEJA BEM VINDO OU BEM VINDA AO ATENDIMENTO MÉDICO VIRTUAL!*");
		System.out.println("************************************************************");
		System.out.println("Devido à pandemia, disponibilizamos este serviço para melhor atendê-lo.");
		System.out.println(
				"Aqui você passa por uma triagem que irá avaliar se você está com suspeita de COVID ou doenças similares.");
		System.out.print("Digite seu nome: ");
		paciente = teclado.next();
		System.out.println("Óla, " + paciente);
		System.out.println("Leia os sintomas abaixo e digite o número referente aos sintomas que você está sentindo: ");
		System.out.println("1: Febre e dor de cabeça" + "\n" + "2: Dores no corpo e fraqueza" + "\n"
				+ "3: Dor no peito e falta de ar");
		opcao = teclado.nextInt();
		System.out.println("Você digitou a opção: " + opcao);
		// ESTRUTURA SWITCH-CASE
		switch (opcao) {
		case 1:
			System.out.println(paciente + " você está com suspeita de COVID, procure um atendimento médico.");
			break;
		case 2:
			System.out.println(paciente + " você está com suspeita de DENGUE, procure um atendimento médico.");
			break;
		case 3:
			System.out.println(paciente + " você está com suspeita de PNEUMONIA, procure um atendimento médico.");
			break;
		default:
			System.out.println("Opção inválida! Digite novamente uma das opções acima.");
			break;
		}
		System.out.println("Obrigado por utilizar nosso serviço!");
		teclado.close();
	}
}