package projet_java_cm_2015;

class Etudiant1 {

	private String nom;
	private String prenom;
	private int num;
	
	public Etudiant1(String nom,String prenom,int num){
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;		
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String toString() {
		return "Etudiant1 [nom=" + nom + ", prenom=" + prenom + ", num=" + num
				+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getNum()=" + getNum() + "]";
	}
	public static void main(String[] args){
		Etudiant1 etu = new Etudiant1("Bah","Macka",10);
	    System.out.println(etu.toString());
	}
}
