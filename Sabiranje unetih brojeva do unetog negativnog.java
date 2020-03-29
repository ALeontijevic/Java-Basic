package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_02_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		do {
			System.out.println("Unesite broj...");
			n = sc.nextInt();
			if (n<0) break;
			else sum =sum+n;
		} while (n >= 0);
		System.out.println("Kraj programa. Zbir unetih brojeva je " +sum+".");
	}

}
