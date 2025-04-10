/*
 * Leia um valor com duas casas decimais, equivalente ao 
 * salário de uma pessoa. Em seguida, calcule e mostre o 
 * valor que esta pessoa deve pagar de Imposto de Renda, 
 * segundo a tabela abaixo.  
 * 
 *     RENDA                     IMPOSTO de RENDA
 *  de 0.00 até R$ 2000.00            Isento
 * de R$ 2000.01 até 3000.00            8%
 * de R$ 3000.01 até 4500.00            18%
 *   acima de R$ 4500.00                28%
 *   
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double imposto;
		if (salario <= 2000.00) {
			imposto = 0.0;
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();

	}

}
