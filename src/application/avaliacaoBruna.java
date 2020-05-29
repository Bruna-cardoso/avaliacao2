package application;

import java.util.Locale;
import java.util.Scanner;

public class avaliacaoBruna {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horasTrabalhadas, opcao;
		double valorHora;
		char continuar;
		
		// Leitura dos dados
		
		
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
			while (horasTrabalhadas < 0) {
				System.out.println("Valor inválido! Por favor digite novamente.");
				System.out.print("Horas trabalhadas: ");
				horasTrabalhadas = sc.nextInt();
			}
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
			while (valorHora < 0) {
				System.out.println("Valor inválido! Por favor digite novamente.");
				System.out.print("Valor por hora: ");
				valorHora = sc.nextDouble();
			}
		System.out.print("Digitar outro (S/N)? ");
		continuar = sc.next().charAt(0);
		
		while (continuar == 'S' || continuar == 's') {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();
			System.out.print("Digitar outro (S/N)? ");
			continuar = sc.next().charAt(0);
		}
		
		// Menu repetindo
		
		System.out.println();
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.print("Digite uma opção: ");
		opcao = sc.nextInt();
		
		while (opcao != 4 || opcao > 4) {
			
			if (opcao > 4) {
				System.out.println();
				System.out.println("Opção inválida! Tente novamente:");
				opcao = sc.nextInt();
			}
			else {
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			}
			
		}
		
		
		
		sc.close();

	}

}
