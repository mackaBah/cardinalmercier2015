package tp4; //Exo1

public class Etudiant extends Personne {
	
	private int num;
	//private static int nbEtu;
	
	public Etudiant() {
	}
	
	public Etudiant(String nom,String prenom,int jour,int mois,int annee,int num){
		super(nom,prenom,jour,mois,annee);
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Etudiant [num=" + num + "," + super.toString()
				+ "]";
	}
	
}
