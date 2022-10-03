package simo_harjutused;

public class Harjutus5 {

	public static void main(String[] args) {
		jagamine();
	}
		
	public static void jagamine() {
			int kordus = 0;
			
			while(kordus < 3) {
					Scanner scanner = new Scanner (System.in);
					System.out.print("Sisesta 1. arv: ");
					int arv1 = scanner.nextInt();
					System.out.print("Sisesta 2. arv: ");
					int arv2 = scanner.nextInt();
				
					if (arv1 >= 0 && arv2 > 0) {
						double tehe = arv1 / arv2;
						System.out.println("Vastus: "+tehe);
						kordus++;
				}
				else {
						System.out.println("Midagi on valesti arvudega.");
				}
			}
			
		}
	}