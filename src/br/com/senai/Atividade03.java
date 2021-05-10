package br.com.senai;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = tec.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = tec.nextInt();
		int par = 0;
		int impar = 0;
		if(num1 > num2) {
			while(num2 <= num1) {
				if((num2 % 2) == 0) {
					par++;
				}
				else {
					impar++;
				}
				System.out.println(num2);
				num2++;
			}
		}
		else {
			while(num1 <= num2) {
				if((num1 % 2) == 0) {
					par++;
				}
				else {
					impar++;
				}
				System.out.println(num1);
				num1++;
			}
		}
		System.out.println("Número PARES: " + par);
		System.out.println("Número ÍMPARES: " + impar);
	}

}