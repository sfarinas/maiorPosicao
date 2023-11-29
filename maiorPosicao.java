package arranjoMaiorPosicao;

import java.util.Scanner;

public class maiorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int qtdMaior = 0;
		int maior = 0;
		int indice = 0;

		System.out.println("Quantos numero voce vai digitar : ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero : ");
			vect[i] = sc.nextInt();
			
			if (vect[i] > maior) {
				qtdMaior ++;
				maior = vect[i];
				indice = i;	
			}
		}
		System.out.println("Maior Valor : " + maior);
		System.out.println("Posicao maior no Vetor : " + indice);
	}
}
