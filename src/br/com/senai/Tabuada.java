package br.com.senai;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int numero = tec.nextInt();
		int multiplicador = 0;
		while(multiplicador <= 10) {
			System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
			multiplicador++;
		}	
	}

}
