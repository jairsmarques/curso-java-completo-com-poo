import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosParte1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		// Cria um objeto do tipo Scanner
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		System.out.println("----------------------");
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);

		System.out.println("----------------------");
		double i;
		i = sc.nextDouble();
		System.out.println("Você digitou: " + i);

		System.out.println("----------------------");
		char j;
		j = sc.next().charAt(0);
		System.out.println("Você digitou: " + j);
		
		System.out.println("----------------------");
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();

	}

}
