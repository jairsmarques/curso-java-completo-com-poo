/*
 * Com base na tabela abaixo, escreva um programa que 
 * leia o código de um item e a quantidade deste item.
 * A seguir, calcule e mostre o valor da conta a pagar.
 * 
 *  * CODIGO   ESPECIFICAÇÃO    PREÇO
 * 	  1       Cachorro Quente  R$ 4.00
 *    2          X-Salada      R$ 4.50
 *    3          X-Bacon       R$ 5.00
 *    4       Torrada Simples  R$ 2.00
 *    5         Refrigerante   R$ 1.50
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		double valor, total;

		switch (codigo) {
		case 1:
			valor = 4.00;
			break;
		case 2:
			valor = 4.50;
			break;
		case 3:
			valor = 5.00;
			break;
		case 4:
			valor = 2.00;
			break;
		case 5:
			valor = 1.50;
			break;
		default:
			valor = 0.0;
			break;
		}

		total = valor * quantidade;
		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
