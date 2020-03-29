package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_01_0302 {

	public static void main(String[] args) {
		// Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		// palindrom”
		// ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom).
		// Korisnik unosi int [ ]
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int n = sc.nextInt();
		while (n <= 1) {
			System.out.println("Greska. Unesite ponovo duzinu niza.");
			n = sc.nextInt();
		}
		int[] niz = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza.");
			niz[i] = sc.nextInt();
		}
		boolean error = false;
		for (int i = 0; i < n-1; i++) {
			if (niz[0 + i] == niz[(n-1) - i])
				error = false;
			else {
				error = true;
				break;
			}
		}
		if (error)
			System.out.println("Niz nije palindrom.");
		else
			System.out.println("Niz je palindrom.");
	}

}
