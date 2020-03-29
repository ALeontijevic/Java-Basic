package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_01_0221 {

	public static void main(String[] args) {
		/* Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 
		 * 1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu) 
		 * 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. 
		 * Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. 
		 * Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna. Ukoliko 
		 * korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna
		 * i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur
		 * i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 */
		Scanner sc = new Scanner(System.in);
		int opcija;
		double cena = 0;
		double racun = 0;
		double uplata = 0;
		double kusur = 0;
		do {
			System.out.println("Unesite opciju: ");
			opcija = sc.nextInt();
				switch (opcija) {
				case 1:
					System.out.println("Unesite cenu proizvoda: ");
					cena = sc.nextDouble();
					racun = racun + cena;
					break;
				case 2:
					System.out.println("Unesite kolicinu novca za naplatu racuna.");
					uplata = sc.nextDouble();
					if (uplata < racun) {
							System.out.println("Greska. Nemate dovoljno sredstava.");
					}
					else if (uplata>=racun) {
							kusur = uplata - racun;
							System.out.printf("Vas kusur je %.2f \n", kusur);
							racun = 0;
					}
					break;
				case 0: 
					System.out.println("Program je zaustavljen.");
					break;
				default:
						System.out.println("Pogresan unos.");
				}
			} while (opcija!=0);
	}

}
