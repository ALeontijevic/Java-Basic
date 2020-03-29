package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_02_0305 {

	public static int[] unos() {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Unesite poziciju: ");
			niz[i] = sc.nextInt();
			while (niz[i] > 8 || niz[i] < 1) {
				System.out.println("Pogresan unos. Pokusajte ponovo.");
				niz[i] = sc.nextInt();
			}
		}
		procena(niz);
		return niz;
		
	}

	public static void procena(int[] a) {
		if (a[0]==a[2]+1 && (a[3] == a[1] -1 || a[3] == a[1]+1)) {
			System.out.println("Sakakac je napadnut.");
			return;
		} else {
			System.out.println("Skakac nije napadnut.");
			return;
		}

	}

	public static void main(String[] args) {
		unos();

	}

}
