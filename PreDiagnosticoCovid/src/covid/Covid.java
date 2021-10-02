package covid;

import java.util.Scanner;

public class Covid {

	// PROJETO INTEGRAGOR I � A PR�-DIAGN�STICO DE COVID MAIS DUAS DOEN�AS SIMILARES.
	//CURSO: AN�LISE E DESENVOLVIMENTO DE SISTEMAS
	public static void main(String[] args) {
		// VARI�VEL
		int opcao = 0;
		String paciente;
		// OBJETO
		Scanner teclado = new Scanner(System.in);
		// ENTRADAS
		System.out.println("***********************************************************");
		System.out.println("*SEJA BEM VINDO OU BEM VINDA AO ATENDIMENTO M�DICO VIRTUAL!*");
		System.out.println("************************************************************");
		System.out.println("Devido � pandemia, disponibilizamos este servi�o para melhor atend�-lo.");
		System.out.println(
				"Aqui voc� passa por uma triagem que ir� avaliar se voc� est� com suspeita de COVID ou doen�as similares.");
		System.out.print("Digite seu nome: ");
		paciente = teclado.next();
		System.out.println("�la, " + paciente);
		System.out.println("Leia os sintomas abaixo e digite o n�mero referente aos sintomas que voc� est� sentindo: ");
		System.out.println("1: Febre e dor de cabe�a" + "\n" + "2: Dores no corpo e fraqueza" + "\n"
				+ "3: Dor no peito e falta de ar");
		opcao = teclado.nextInt();
		System.out.println("Voc� digitou a op��o: " + opcao);
		// ESTRUTURA SWITCH-CASE
		switch (opcao) {
		case 1:
			System.out.println(paciente + " voc� est� com suspeita de COVID, procure um atendimento m�dico.");
			break;
		case 2:
			System.out.println(paciente + " voc� est� com suspeita de DENGUE, procure um atendimento m�dico.");
			break;
		case 3:
			System.out.println(paciente + " voc� est� com suspeita de PNEUMONIA, procure um atendimento m�dico.");
			break;
		default:
			System.out.println("Op��o inv�lida! Digite novamente uma das op��es acima.");
			break;
		}
		System.out.println("Obrigado por utilizar nosso servi�o!");
		teclado.close();
	}
}