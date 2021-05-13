package br.com.senai;

public class LacoDeRepeticao {

	public static void main(String[] args) {

		int valor = 0;
		System.out.println("Valor Inicial: " + valor);
		
		do {
			System.out.println("->" + valor);
			valor++;
			
		} while(valor <= 10);

		System.out.println("Valor Final: " + valor);
	}

}
