package tp4;

public class TestEmploye {

	public static void main(String[] args) {
		Personne p1= new Personne("Bah", "Macka", 7, 6, 1976);
		System.out.println(p1);
		Etudiant etu1 =new Etudiant("Balde", "Alpha",7, 06, 1976, 1);
		System.out.println(etu1);
		Employe empl = new Employe("Diallo", "Ibrahim", 02, 07, 1975, 2012354);
		System.out.println(empl);

	}

}
