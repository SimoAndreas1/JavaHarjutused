package simo_harjutused;

import java.util.Scanner;

public class Harjutus4 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			System.out.print("Sisesta suvaline tekst: ");
			String tekst = scanner.nextLine();
			
			System.out.println(tekst.toUpperCase());
			System.out.println(tekst.length());
			
			int wordCount = 1;
			
	for (int i = 0; i < tekst.length(); i++) {
		if (tekst.charAt(i) == ' ')
		{
			wordCount++;
		}
	}
	
	
	System.out.println("Sonu kokku on " + wordCount);
	
	String[] esimene;
	esimene = tekst.split(" ");
	
	System.out.printf("Esimene sõna tekstis on %s",esimene);

	}

}
