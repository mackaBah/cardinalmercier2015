package tp4;

public class Personne {
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	public Personne(){
		
	}
	public Personne(String nom,String prenom,int jour,int mois,int annee){
		this.nom = nom;
		this.prenom = prenom;
		dateDeNaissance = new Date(jour,mois,annee);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateDeNaissance=" + dateDeNaissance + "]";
	}

}
