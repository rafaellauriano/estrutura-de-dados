package aula01_vetor_numeros;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		numeros[0] = 33;
		numeros[1] = 22;
		numeros[2] = 01;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Qual número você quer buscar? ");
		int num = sc.nextInt();
		
		boolean encontrou = false;
		for(int i=0; i<numeros.length; i++) {
			int elemento = numeros[i];
			if(elemento == num) {
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
