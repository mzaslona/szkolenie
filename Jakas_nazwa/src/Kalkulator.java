import java.util.Scanner;

public class Kalkulator {
	
	
	public static void main(String[] args) {

		System.out.println("Podaj liczb�");
		Scanner scanner = new Scanner(System.in);
		int liczba1 = scanner.nextInt();

		System.out.println("Podaj drug� liczb�");
		int liczba2 = scanner.nextInt();

		System.out.println("Podaj dzia�anie jakie chcesz wykona�");
		String znak = scanner.next();
		

		policzIf(liczba1, liczba2, znak);
		policzSwitch(liczba1, liczba2, znak);
		
		int wynik = policzIf(liczba1, liczba2, znak);
		System.out.println("Tw�j wynik to (main): " + wynik);
	}

	public static void policzSwitch(int liczba1, int liczba2, String znak) {
		 int wynik = 0;
	switch(znak){
	case "+" :
		wynik = liczba1 + liczba2;
		break;
	case "-" :
		wynik = liczba1 - liczba2;
		break;
	case "*" :
		wynik = liczba1 * liczba2;
		break;
	case "/" :
		wynik = liczba1 / liczba2;
		break;
	default :
		System.out.println("Co� �le wpisa�e� (switch)");
	}
	System.out.println("Tw�j wynik to (switch): " + wynik);
		
	}

	private static int policzIf(int liczba1, int liczba2, String znak) {
		 int wynik = 0;
		if (znak.equals("+"))
			wynik = liczba1 + liczba2;
		else if (znak.equals("-"))
			wynik = liczba1 - liczba2;
		else if (znak.equals("*"))
			wynik = liczba1 * liczba2;
		else if (znak.equals("/"))
			wynik = liczba1 / liczba2;
		else {
			System.out.println("Niew�a�ciwe dzia�anie (if)");

		}
		System.out.println("Tw�j wynik to (if): " + wynik);
		return wynik;
	}

}
