package br.com.fiap.si;

import java.util.Scanner;
import java.util.ArrayList;


public class Cliente {
	
	int id;
	String nome;
	int age;
	int phone;
	
	public Cliente(int id, String nome, int age, int phone) {
		this.id = id;
		this.nome = nome;
		this.age = age;
		this.phone = phone;
			
	}

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		int id, age, phone;
		String nome;
		
		ArrayList<Cliente> infos = new ArrayList<Cliente>();
			
		while(true){
			
			System.out.println("\nDIGITE SEU ID:");
			id = s.nextInt();
			if(id>=0) {
				
				System.out.println("DIGITE SEU NOME:");
				s.nextLine();
				nome = s.nextLine();
				System.out.println("DIGITE SUA IDADE:");
				age = s.nextInt();
				System.out.println("DIGITE SEU TELEFONE");
				phone = s.nextInt();
			}
			else {
				System.out.println("ID INVALIDO");
				break;
			}
			
			infos.add(new Cliente(id, nome, age, phone));
		}
			
		for(int i=0; i<infos.size();i++) {
			
			System.out.print("\n--------------INFORMACOES DO CLIENTE " +(i+1)+"-----------\nID: " + infos.get(i).id+ "\n");
			System.out.print("\nNOME: " + infos.get(i).nome+ "\n");
			System.out.print("\nIDADE: " + infos.get(i).age+ "\n");
			System.out.print("\nTELEFONE: " + infos.get(i).phone+ "\n");
		}
		
		s.close();
	}
}
