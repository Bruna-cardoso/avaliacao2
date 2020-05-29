package application;

import java.util.Locale;
import java.util.Scanner;

public class avaliacaoBruna {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horasTrabalhadas, opcao, totalHoras;
		double valorHora, custoTotal, totalValor;
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
		
		totalHoras = horasTrabalhadas;
		custoTotal = valorHora * horasTrabalhadas;
		
		while (continuar == 'S' || continuar == 's') {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			totalHoras = totalHoras + horasTrabalhadas;
			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();
			custoTotal = custoTotal + valorHora * horasTrabalhadas;
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
			
			// Tratativas 1 e 2
			
				if (opcao == 1) {
					System.out.println();
					System.out.print("Total de horas = " + totalHoras);
					System.out.println();
				}
				else if (opcao == 2) {
					System.out.println();
					System.out.printf("Custo total = R$ %.2f%n", custoTotal);
					System.out.println();
				}
				else {
					System.out.println();
					System.out.println("Pessoa que ganhou mais: ANA");
				}
			
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			
		}		
		
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		sc.close();

	}

}
