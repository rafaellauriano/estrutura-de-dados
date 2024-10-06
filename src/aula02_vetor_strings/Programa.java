package aula02_vetor_strings;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		String[] estados = new String[3];
		estados[0] = "SP";
		estados[1] = "AC";
		estados[2] = "RJ";
		
		for(int i=0; i<estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Qual estado deseja buscar? ");
		String estado = sc.next();
		
		boolean encontrou = false;
		for(int i=0; i<estados.length; i++) {
			String elemento = estados[i];
			if(elemento.equalsIgnoreCase(estado)){
				encontrou = true;
				break;
			}
		}
		
		if(encontrou == true) {
			System.out.println("Encontrou!!");
		}else {
			System.out.println("Não encontrou!!");
		}
		
		sc.close();
	}

}
