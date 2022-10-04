package simo_harjutused;

import java.util.Scanner;

public class Harjutus7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			viga();

	}
	
	public static void viga() {
			Scanner scanner = new Scanner (System.in);
			try {
					System.out.print("Sisesta arv: ");
					int arv1 = scanner.nextInt();
					System.out.print("Sisesta teine arv: ");
					int arv2 = scanner.nextInt();
					
					int s = arv1/arv2;
					System.out.println(s);
			} catch (Exception e) {
					System.out.println("VIGA!!!");
			}
			System.out.println("Programmi töö jätkub.");
			viga();
	}

}
