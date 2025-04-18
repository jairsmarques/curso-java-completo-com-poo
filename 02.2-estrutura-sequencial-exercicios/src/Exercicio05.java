/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de 
 * peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, qtdPecas1;
		double valorPeca1, totalPeca1;
		codigoPeca1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		totalPeca1 = qtdPecas1 * valorPeca1;

		int codigoPeca2, qtdPecas2;
		double valorPeca2, totalPeca2;
		codigoPeca2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		totalPeca2 = qtdPecas2 * valorPeca2;

		double totalPagamento = totalPeca1 + totalPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagamento);

		sc.close();

	}

}
