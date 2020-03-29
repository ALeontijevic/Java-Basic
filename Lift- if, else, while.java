package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_01_0206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj osoba ili objekta koje treba da se prevezu liftom: ");
		int n = sc.nextInt();
		double suma = 0;
		double tezina = 0;
		if (n >= 0) {
			if (n == 0)
				System.out.println("Lift je prazan i moze da se pokrene. Odaberite sprat.");
			else {
				while (n >= 1) {
					System.out.println("Uneti tezinu " + n + ". osobe/objekta koju lift treba da ponese u kg: ");
					tezina = sc.nextDouble();
					suma = suma + tezina;
					n--;
				}
				if (suma >= 0) {
					if (suma < 680)
						System.out.println("Lift je pokrenut.");
					else if (suma == 680)
						System.out.println("Lift je na granici.");
					else
						System.out.println("Lift je preopterecen.");
				} else
					System.out.println("Uneta tezina mora biti pozitivan broj.");
			}
		} else
			System.out.println("Uneta vrednost mora biti pozitivan broj.");
	}

}
