package br.com.senai;

import java.util.Scanner;

public class AtividadeLogica {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		
		do {
			System.out.println("-----------MENU-----------");
			System.out.println("1 - Verificar sexo e idade");
			System.out.println("2 - Contagem de valores");
			System.out.println("3 - Tabuada");
			System.out.println("4 - Cadastrar cursos");
			System.out.println("--------------------------");
			System.out.print("Informe a opção desejada: ");
			int opcaoDoMenu = tec.nextInt();
			
			switch (opcaoDoMenu) {
			case 1:
				System.out.println("--VERIFICAR SEXO E IDADE--");
				System.out.print("Informe o seu nome: ");
				String nome = tec.next();
				System.out.print("Informe o seu ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				System.out.print("Informe o seu sexo [M/F]: ");
				String sexo = tec.next();
				int idade = 2021 - anoDeNascimento;
				if (sexo.equalsIgnoreCase("m")) {
					System.out.println(nome + ", você nasceu em " + anoDeNascimento + ", tem " + idade + " anos e é do sexo masculino.");
				} else if (sexo.equalsIgnoreCase("f")) {
					System.out.println(nome + ", você nasceu em " + anoDeNascimento + ", tem " + idade + " anos e é do sexo feminino.");
				} else if(!sexo.equalsIgnoreCase("m") || !sexo.equalsIgnoreCase("f")) {
					System.out.println("Opção inválida!");
					break;
				} if (idade < 12) {
					System.out.println("Você é uma criança.");
				} else if (idade >= 12 && idade < 18) {
					System.out.println("Você é jovem.");
				} else if (idade >= 18 && idade <= 65) {
					System.out.println("Você é adulto.");
				} else {
					System.out.println("Você é idoso.");
				} if (idade < 16) {
					System.out.println("Você não pode votar.");
				} else if (idade == 16 || idade == 17 || idade > 70) {
					System.out.println("Seu voto é opcional.");
				} else {
					System.out.println("Seu voto é obrigatório.");
				} if (idade < 18) {
					System.out.println("Você não pode tirar a habilitação para dirigir.");
				} else {
					System.out.println("Você pode tirar a habilitação para dirigir.");
				}
				break;
			case 2:
				System.out.println("----CONTAGEM DE VALORES----");
				System.out.print("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();
				if (primeiroValor > segundoValor) {
					do {
						System.out.println(segundoValor);
						segundoValor++;
					} while (segundoValor <= primeiroValor);
				} else if (segundoValor > primeiroValor) {
					do {
						System.out.println(primeiroValor);
						primeiroValor++;
					} while (primeiroValor <= segundoValor);
				} else {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência.");
				}
				break;
			case 3:
				System.out.println("---------TABUADA---------");
				System.out.print("Informe o número: ");
				int numero = tec.nextInt();
				int multiplicador = 0;
				while(multiplicador <= 10) {
					System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
					multiplicador++;
				}
				break;
			case 4:
				System.out.println("----CADASTRAR CURSOS----");
				String [] cursos = new String[5];
				System.out.print("Deseja cadastrar um novo curso? [S/N]: ");
				String inserirCurso = tec.next();
				if(!inserirCurso.equalsIgnoreCase("s")) {
					for (int j = 0; j < cursos.length; j++) {
						System.out.print(cursos[j] + " | ");
					}
					break;
				}
				int i = 0;
				do {
					System.out.print("Informe o nome do curso: ");
					cursos[i] = tec.next();
					System.out.print("Deseja cadastrar um novo curso? [S/N]: ");
					inserirCurso = tec.next();
					i++;
				} while (inserirCurso.equalsIgnoreCase("s"));
				for (int j = 0; j < cursos.length; j++) {
					System.out.print(cursos[j] + " | ");
				}
				break;
			default:
				System.out.println("Opção inválida");
				break;
			
			
			}System.out.println(" "); 
			System.out.print("Deseja realizar outra operação? [S/N]: ");
			continuar = tec.next();
		} while (continuar.equalsIgnoreCase("s"));
		System.out.println("Sistema encerrado.");
	}

}
