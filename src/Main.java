import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int quadrado = 0;
		int cubo = 0;
		for (int i = 1; i <= n; i++) {
			quadrado = i * i;
			cubo = i * quadrado;

			System.out.println("" + i + " " + quadrado + " " + cubo);

		}
		sc.close();
	}
}
