package tp4;

public class Employe extends Personne {
    private int numMatricule;
	public Employe() {
	}
	public Employe(String nom,String prenom,int jour,int mois,int annee,int numMatricule ){
		super(nom,prenom,jour,mois,annee);
		this.numMatricule = numMatricule;
	}
	public int getNumMatricule() {
		return numMatricule;
	}
	public void setNumMatricule(int numMatricule) {
		this.numMatricule = numMatricule;
	}
	@Override
	public String toString() {
		return "Employe [numMatricule=" + numMatricule + "\n"+ super.toString() +  "]";
	}
	

}
