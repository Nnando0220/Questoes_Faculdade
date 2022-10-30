package br.com.fiap.si;

import java.util.Scanner;

public class TesteJava {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float pes, imc, alt;
		
		System.out.println("DIGITE A SUA ALTURA:");
		alt = s.nextFloat();
		System.out.println("DIGITE SEU PESO:");
		pes = s.nextFloat();
		
		s.close();
		
		imc = pes/(alt*alt);
		
		if(imc>=18.5 && imc<=25) {
			System.out.println("O SEU PESO É IDEAL!");
			System.out.printf("\nO SEU IMC FOI DE %.2f", imc);
		}
		else {
			System.out.println("O PESO NÃO É O IDEAL!");
		}

	}
}
