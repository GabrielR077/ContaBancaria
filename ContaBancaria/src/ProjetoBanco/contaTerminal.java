package ProjetoBanco;

import java.util.Scanner;

public class contaTerminal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("===================================="
				+ "=====================================================");
		
		System.out.println("Olá querido Cliente, "
				+ "informe seu nome, Número e Agência "
				+ "para a consulta de seu saldo!");	
		System.out.println("=========================================="
				+ "===============================================");
		
		//	Inserindo Dados
		
		System.out.println("Insira seu nome: ");
		String nomeCLiente = scan.nextLine();
		
		
		System.out.println("Insira o número de sua conta: ");
		int numero = scan.nextInt();

		System.out.println("Agora insira sua agência: ");
		int agencia = scan.nextInt();

		double saldo = 250.0;
		System.out.println("Seu saldo disponível para saque é: " + saldo);
		
		//	Finalizando o programa
		System.out.println("Programa Finalizado!");
		
		scan.close();
		
		System.exit(0);
	}
}
