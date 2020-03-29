package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_01_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n; koristiti jednu petlju
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();
		int sum = 0;
		int proizvod = 1;
		boolean error = false;
		if (n <= 0) {
			System.out.println("Nedozvoljen unos.");
			error = true;
		} else {
			for (int i = 1; i <= n + 1; i++) {
				if (i % 2 == 0)
					sum = sum + i;
				else
					proizvod = proizvod * i;
			}
		}
		if (!error) {
			System.out.println("Suma parnih brojeva od 0 do " + n + " je " + sum + ".");
			System.out.println("Proizvod neparnih brojeva od 0 do " + n + " je " + proizvod + ".");
		}
	}
}
