package td4;
//Variable static .
public class Etudiant {
	
	private String nom;
	private String prenom;
	private int num;
	private static int nbEtu;
	
	public Etudiant (String nom,String prenom){
		nbEtu++;
		this.num = nbEtu;
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", num=" + num
				+ "]";
	}


	public static void main(String[] args) {
		Etudiant e = new Etudiant("Bah","Macka");
		System.out.println(e);
		Etudiant e1 = new Etudiant("Dialoo","Asmaou");
		System.out.println(e1);
		Etudiant e2 = new Etudiant("Vroman","Marie-Noel");
		System.out.println(e2);
		System.out.println("Nombre d'etudiant : " + nbEtu);
		

	}

}
