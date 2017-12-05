import java.util.Scanner;

public class FiguryTest extends FiguryMetody {
	
	public void pole() {
		Scanner odczyt = new Scanner(System.in);
		nazwa = odczyt.nextLine();
		if(nazwa.equals("Kwadrat")){
			System.out.println("Podaj długość boku a w cm: ");
			bokA = odczyt.nextInt();
			System.out.println("Podaj długość boku b w cm: ");
			bokB = odczyt.nextInt();
			poleKwadratu();
		}
		if(nazwa.equals("Trójkąt")){
			System.out.println("Podaj długość podstawy w cm: ");
			podstawa = odczyt.nextInt();
			System.out.println("Podaj wysokość w cm: ");
			h = odczyt.nextInt();
			poleTrójkąta();
		}
		if(nazwa.equals("Koło")){
			System.out.println("Podaj promień w cm: ");
			r = odczyt.nextInt();
			poleKoła();
		}
		else {
			System.out.println("Podałeś nieprawidłowe dane.");
		}
}
	public static void main(String[]args){
		System.out.println("Podaj figurę: Kwadrat, Trójkąt lub Koło: ");
		
		FiguryTest figura = new FiguryTest();
		figura.pole();
	
	}
}
