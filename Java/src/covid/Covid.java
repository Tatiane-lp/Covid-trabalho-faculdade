package covid;

import java.util.Scanner;

public class Covid {
	
	//TRABALHO DA FACULDADE PARA FAZER UM PR�-DIAGN�STICO DE COVID, COM 
	//OUTRAS DOEN�AS SIMILARES.
	public static void main(String[] args) {
		
		// VARI�VEL
		int opcao = 0;
		String paciente;

		// OBJETO
		Scanner teclado = new Scanner(System.in);

		// ENTRADAS
		System.out.print("Digite o nome do paciente: ");
		paciente = teclado.next();
		System.out.println("1: Febre e dor de cabe�a" + "\n" + "2: Dores no corpo e fraqueza" + "\n"
				+ "3: Dor no peito e falta de ar");
		System.out.println(paciente + " digite o numero da lista que cont�m os seus sintomas:");
		opcao = teclado.nextInt();

		// ESTRUTURA SWITCH
		switch (opcao) {
		case 1:
			System.out.println(paciente + " vo�� est� com suspeita de COVID, procure um atendimento m�dico.");
			break;
		case 2:
			System.out.println(paciente + " vo�� est� com suspeita de DENGUE, procure um atendimento m�dico.");
			break;
		case 3:
			System.out.println(paciente + " vo�� est� com suspeita de PNEUMONIA, procure um atendimento m�dico.");
			break;
		default:
			System.out.println("Op��o inv�lida! Digite novamente uma das op��es acima.");
			break;

		}teclado.close();

	}

}