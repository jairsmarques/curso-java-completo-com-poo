/*
 * Fazer um programa para ler um número inteiro positivo N. 
 * O programa deve então mostrar na tela N linhas, começando 
 * de 1 até N. Para cada linha, mostrar o número da linha, 
 * depois o quadrado e o cubo do valor.
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int primeiroNumero = i;
			int segundoNumero = i * i;
			int terceiroNumero = i * i * i;
			
			System.out.printf("%d %d %d%n", primeiroNumero, segundoNumero, terceiroNumero);
		}

		sc.close();

	}

}
