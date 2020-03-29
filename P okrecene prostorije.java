import java.util.Scanner;

public class Zadatak_1_0204 {

	public static void main(String[] args) {
		/*
		Izracunati povrsinu okrecene prostorije, tako sto se ivice prostorije
		ucitavaju preko konzole (soba ima zidove pravougaonog oblika
		i nema prozora)  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu, visinu i sirinu prostorije u m:");
		double duzina = sc.nextDouble();
		double visina = sc.nextDouble();
		double sirina = sc.nextDouble();
		System.out.println("Unsite visinu i sirinu vrata u m:");
		double vv = sc.nextDouble();
		double sv = sc.nextDouble();
		double pb, pp, pv;
		pv = vv*sv;
		
		if (duzina>0 && visina>0 && sirina>0 && vv>0 && sv >0) {
			pb = duzina*visina*2 + sirina*visina*2 - pv;
			System.out.printf("Povrsina bocnih zidova prostorije iznosi: %.2f m2.\n", pb);
			pp = sirina*duzina;
			System.out.printf("Povrsina plafona iznosi: %.2f m2.\n", pp);
		}
		else System.out.println("Sve unete vrednosti moraju biti pozitivne.");
	}

}
