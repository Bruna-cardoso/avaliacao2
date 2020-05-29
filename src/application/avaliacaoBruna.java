package application;

import java.util.Locale;
import java.util.Scanner;

public class avaliacaoBruna {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horasTrabalhadas;
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
		
		
		
		
		
		sc.close();

	}

}
