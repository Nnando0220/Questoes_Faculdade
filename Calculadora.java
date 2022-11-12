package br.com.fiap.si;

import java.util.Scanner;

public class Calculadora {
	
	public static void soma(int num1, int num2) {
		
		int tot = num1+num2;
		
		System.out.println("\n\nA soma de "+num1+"+"+num2+"="+tot);
		
	}
	
	public static void sub(int num1, int num2) {
		
		int tot = num1-num2;
		
		System.out.println("\n\nA subtracao de "+num1+"-"+num2+"="+tot);
		
	}
	
	public static void mul(int num1, int num2) {
		
		int tot = num1*num2;
		
		System.out.println("\n\nA multiplicacao de "+num1+"*"+num2+"="+tot);
		
	}
	
	public static void divi(int num1, int num2) {
		
		int tot = num1/num2;
		
		System.out.println("\n\nA divisao de "+num1+"/"+num2+"="+tot);
		
	}
	
	public static void res(int num1, int num2) {
		
		int tot = num1%num2;
		
		System.out.println("\n\nO resto de "+num1+"/"+num2+"="+tot);
		
	}
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner s = new Scanner(System.in);
		
		int op;
		
		do {
			
			System.out.println("\n\nDigite o numero correspondente a operacao desejada");
			System.out.println("********************************************************\n");
			System.out.println("********************************************************\n");
			System.out.println("* 1 - Adicao de dois numeros\r\n"
								+ "* 2 - Subtracao de dois numeros\n"
								+ "* 3 - Multiplicacao de dois numeros\r\n"
								+ "* 4 - Divisao de dois numeros\r\n"
								+ "* 5 - O resto da divisao(modulo) de dois numeros\r\n"
								+ "* 9 - Encerrar Programa");
			System.out.println("********************************************************");
			
			op = s.nextInt();
			
			switch(op) {
			
			case 1:
				
				System.out.println("\n\nOperacao soma selecionada!!!");
				
				System.out.println("Digite o primeiro numero:");
				num1 = s.nextInt();
				System.out.println("Digite o segundo numero:");
				num2 = s.nextInt();
				
				soma(num1, num2);
				break;
				
			case 2:
				
				System.out.println("\n\nOperacao subtracao selecionada!!!");
				
				System.out.println("Digite o primeiro numero:");
				num1 = s.nextInt();
				System.out.println("Digite o segundo numero:");
				num2 = s.nextInt();
				
				sub(num1, num2);
				break;
				
			case 3:
				
				System.out.println("\n\nOperacao multiplicacao selecionada!!!");
				
				System.out.println("Digite o primeiro numero:");
				num1 = s.nextInt();
				System.out.println("Digite o segundo numero:");
				num2 = s.nextInt();
				
				mul(num1, num2);
				break;
				
			case 4:
				
				System.out.println("\n\nOperacao divisao selecionada!!!");
				
				System.out.println("Digite o primeiro numero:");
				num1 = s.nextInt();
				System.out.println("Digite o segundo numero:");
				num2 = s.nextInt();
				
				divi(num1, num2);
				break;
				
			case 5:
				
				System.out.println("\n\nOperacao resto selecionada!!!");
				
				System.out.println("Digite o primeiro numero:");
				num1 = s.nextInt();
				System.out.println("Digite o segundo numero:");
				num2 = s.nextInt();
				
				res(num1, num2);
				break;
			}
			
			
			if(op>=9) {
				
				System.out.println("\n\nPrograma encerrado!!!\n");
				break;
				
			}
			
		}while(true);
			
		s.close();
	}
}
