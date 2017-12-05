import static java.lang.Math.*;

public abstract class FiguryMetody extends FiguryNazwy {
	
	double poleKwadrat;
	double poleTrójkąt;
	double poleKoło;
	
	public void poleKwadratu(){
		poleKwadrat = bokA * bokB;
		System.out.print("Pole kwadratu wynosi: "+poleKwadrat+"cm^2");
	}
	public void poleTrójkąta(){
		poleTrójkąt = (podstawa*h)/2;
		System.out.print("Pole trójkąta wynosi: "+poleTrójkąt+"cm^2");
	}
	public void poleKoła(){
		poleKoło = Math.PI * (pow(r, 2));
		System.out.print("Pole koła wynosi: ");
		System.out.format("%.2f%n", poleKoło);
	}
	public FiguryMetody(){ 
	}
	public FiguryMetody(String nazwa){ 
		this.nazwa = nazwa;
	}
	
	// Gettery i Settery
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getBokA() {
		return bokA;
	}

	public void setBokA(double bokA) {
		this.bokA = bokA;
	}

	public double getBokB() {
		return bokB;
	}

	public void setBokB(double bokB) {
		this.bokB = bokB;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}


}
