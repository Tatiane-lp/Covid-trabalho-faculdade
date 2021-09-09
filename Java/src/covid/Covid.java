package covid;

import java.util.Scanner;

public class Covid {
	
	//TRABALHO DA FACULDADE PARA FAZER UM PRÉ-DIAGNÓSTICO DE COVID, COM 
	//OUTRAS DOENÇAS SIMILARES.
	public static void main(String[] args) {
		
		// VARIÁVEL
		int opcao = 0;
		String paciente;

		// OBJETO
		Scanner teclado = new Scanner(System.in);

		// ENTRADAS
		System.out.print("Digite o nome do paciente: ");
		paciente = teclado.next();
		System.out.println("1: Febre e dor de cabeça" + "\n" + "2: Dores no corpo e fraqueza" + "\n"
				+ "3: Dor no peito e falta de ar");
		System.out.println(paciente + " digite o numero da lista que contém os seus sintomas:");
		opcao = teclado.nextInt();

		// ESTRUTURA SWITCH
		switch (opcao) {
		case 1:
			System.out.println(paciente + " voçê está com suspeita de COVID, procure um atendimento médico.");
			break;
		case 2:
			System.out.println(paciente + " voçê está com suspeita de DENGUE, procure um atendimento médico.");
			break;
		case 3:
			System.out.println(paciente + " voçê está com suspeita de PNEUMONIA, procure um atendimento médico.");
			break;
		default:
			System.out.println("Opção inválida! Digite novamente uma das opções acima.");
			break;

		}teclado.close();

	}

}