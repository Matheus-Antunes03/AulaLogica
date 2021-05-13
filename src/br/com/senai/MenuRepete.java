package br.com.senai;

import java.util.Scanner;

public class MenuRepete {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		
		do {
			System.out.println("---MENU---");
			System.out.println("1) Tabuada com Do While");
			System.out.println("2) Tabuada com For");
			System.out.println("3) Editar");
			System.out.println("4) Excluir");
			System.out.println("5) Sair");
			System.out.println("----------");
			System.out.print("Informe a opção desejada: ");
			int opcaoDoMenu = tec.nextInt();
			
			switch (opcaoDoMenu) {
			case 1:
				System.out.println("---TABUADA DO WHILE---");
				int valor;
				int multiplicador = 0;
				
				System.out.print("Informe um valor inteiro: ");
				valor = tec.nextInt();
				
				do {
					System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				} while(multiplicador <= 10);
				
				break;
			case 2:
				System.out.println("---TABUDADA FOR---");
				int valor2;
				System.out.print("Informe o valor: ");
				valor2 = tec.nextInt();
				
				for(int i = 0; i <= 10; i++) {
					System.out.println(valor2 + " x " + i + " = " + (valor2 * i));
				}
				break;
			case 3:
				System.out.println("---EDITAR---");
				break;
			case 4:
				System.out.println("---EXCLUIR---");
				break;
			case 5:
				opcao = "n";
				break;
			default:
				System.out.println("Opção Inválida.");
				break;
			}
			
		} while(opcao.equalsIgnoreCase("s"));

		System.out.println("Sistema Finalizado.");
	}


}
