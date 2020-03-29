package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_01_0305 {
	
	public static int[] niz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int a = sc.nextInt();
		while (a <= 0) {
			System.out.println("Pogresan unos, pokusajte ponovo: ");
			a = sc.nextInt();
		}
		int[] niz = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Unesite " + (i+1)+ ". clan niza: ");
			niz[i] = sc.nextInt();
		}
		procena(niz);
		return niz;
	}
	
	public static void procena(int[]a) {
		boolean greska = false;
		for (int i = 0; i < a.length-1; i++) {
			if (a[0 + i] == a[(a.length - 1)-i])
				greska = false;
			else {
				greska = true;
				break;
			}
		}
		if (!greska)
			System.out.println("Niz je palindrom.");
		else
			System.out.println("Niz nije palindrom.");

	}

	public static void main(String[] args) {
		// Domaci zadatak od utorka “da li je niz celih brojeva palindrom ili nije”
		// uradi koristeci metode.

		niz();
		
		
		
	}

}
