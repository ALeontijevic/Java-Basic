package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_02_0302 {

	public static void main(String[] args) {
		// Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		// niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
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
		int proizvod = 1;
		for (int i = 0; i < n; i++) {
			if (niz[i] > i) {
				proizvod = proizvod * niz[i];
			}
		}
		if(proizvod==1)System.out.println("U nizu nema brojeva koji su veci od svog indeksa.");
		else System.out.println("Proizvod brojeva koji su vecu od svog indeksa je: "+proizvod);
	}

}
