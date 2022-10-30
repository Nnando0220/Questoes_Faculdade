package br.com.fiap.si;

import java.util.Scanner;
import java.util.ArrayList;

public class Contato {
	
	int data;
	String nome;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Contato contatos = new Contato();
		
		ArrayList<String> infos_nome = new ArrayList<>();
		ArrayList<Integer> infos_data = new ArrayList<>();
		
		for(int i=0; i<2; i++) {
			
			System.out.println("DIGITE O SEU NOME:");
			contatos.nome = s.nextLine();
			infos_nome.add(contatos.nome);
			System.out.println("DIGITE A SUA DATA:");
			infos_data.add(contatos.data);
			contatos.data = s.nextInt();
			s.nextLine();
		}
		
		for(int j=0; j<2; j++){
			System.out.println("NOME DO CONTATO: "+infos_nome.get(j));
			System.out.print("NUMERO DO CONTATO:"+infos_data.get(j)+"\n");
			
		}	
		s.close();
	}
}


