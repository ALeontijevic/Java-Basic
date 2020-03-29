package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_04_0221 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();
		int act = 0;
		int prev = 0;
		int next = 1;
		
		System.out.print("Prvih " + n + " brojeva Fibonacijevog niza su: ");
		for (int i = 1; i <= n; i++) {
			act = prev;
			prev = next;
			next = act + prev;
			System.out.print(act + " ");
		}

	}

}
