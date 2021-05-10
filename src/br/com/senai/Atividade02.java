package br.com.senai;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = tec.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = tec.nextInt();

		if(num1 > num2) {
			while(num1 >= num2) {
				System.out.println(num1);
				num1--;
			}
		}
		else {
			while(num1 <= num2) {
				System.out.println(num1);
				num1++;
			}
		}
	}

}
