package Day30Poly;
class Hillstations {
	void location() {
		System.out.println("Location is:");
	}
	void famousfor() {
		System.out.println("Famous for:");
	}
}
class Manali extends Hillstations {
	void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}
	void famousfor() {
		System.out.println("It is Famous for Hadimba Temple and adventure sports");
	}
}
class Mussoorie extends Hillstations {
	void location() {
		System.out.println("Mussoorie is in Uttarakhand");
	}
	void famousfor() {
		System.out.println("It is Famous for education institutions");
	}
}
class Gulmarg extends Hillstations {
	void location() {
		System.out.println("Gulmarg is in J&K");
	}
	void famousfor() {
		System.out.println("It is Famous for skiing");
	}
}
public class Runtime2 {
	public static void main(String args[]) {
		
		Hillstations A = new Hillstations();
		A.location();//
		A.famousfor();//		
		Hillstations M = new Manali();
		M.location();//
		M.famousfor();//
		Hillstations Mu = new Mussoorie();
		Mu.location();//
		Mu.famousfor();//		
		Hillstations G = new Gulmarg();
		G.location();//
		G.famousfor();//
	}
}
