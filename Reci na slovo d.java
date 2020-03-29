package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_03_0302 {

	public static void main(String[] args) {
		// Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju slovom d.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String txt = sc.nextLine();
		txt = txt.toLowerCase();
		String[] s = txt.split(" ");
		int sum = 0;
		for(int i=0; i<s.length; i++) {
			char n = s[i].charAt(0);
			if (n=='d') sum+=1;
		}
		System.out.println("Broje reci koje pocinju slovom 'd' je "+sum);

}
}
