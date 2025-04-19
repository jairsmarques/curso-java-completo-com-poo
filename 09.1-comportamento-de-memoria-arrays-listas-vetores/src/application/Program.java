/*
 * Fazer um programa para ler um número inteiro N e a altura N de pessoas.
 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média
 * dessas pessoas.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		/* Cria um vetor com o tamanho que o usuário digitar */
		double[] vect = new double[n];

		/* Percorre o vetor e adiciona os valores digitados pelo 
		 * usuário nas posições do vetor. 
		 */
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();

		}

		/* Cria uma váriavel para armazenar a soma */
		double sum = 0.0;
		
		/* Percorre o vetor e acumula os valores digitados pelo usuário
		 * na variável criada anteriormente (sum)
		 */
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		/* Cria uma variável para calcular a média dos valores 
		 * digitados nas posições dos vetores 
		 */
		double avg = sum / n;

		/* Imprime o valor da média */
		System.out.printf("AVERAGE HEIGHT: %.2f%n " , avg);

		sc.close();

	}

}
