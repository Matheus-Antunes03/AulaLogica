package br.com.senai;

import java.util.Scanner;

public class JavaVetor {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int idade[] = {5, 18, 16, 21, 20, 4, 28, 32};
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
	
		String addNovo = "s";
		do {
			System.out.println("Informe o index do vetor: ");
			for(int i = 0; i < idade.length; i++ ) {
				System.out.print(i + " | ");
			}
			System.out.print("-> ");
			int index = tec.nextInt();
			System.out.print("Informe a idade: ");
			idade[index] = tec.nextInt();
			
			System.out.print("Deseja informar uma nova idade?[S/N] ");
			addNovo = tec.next();
		}while(addNovo.equals("s"));
		System.out.println("Vetor Ordenado: ");
		
		int aux;
		for(int i1 = 0; i1 < idade.length - 1; i1++) {
			for(int j = i1 + 1; j < idade.length; j++) {
				if(idade[i1] > idade[j]) {
					aux = idade[i1];
					idade[i1] = idade[j];
					idade[j] = aux;
				}
			}
		}
		for(int i = 0; i < idade.length; i++) {
			System.out.print(idade[i] + " | ");
		}
		
		
		}
		}



