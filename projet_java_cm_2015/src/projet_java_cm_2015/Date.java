package projet_java_cm_2015;
import javax.swing.JOptionPane;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	Date(int jour, int mois, int annee){
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	Date(int jour, int mois){
		this.jour = jour;
		this.mois = mois;
		this.annee = 2015;
	}
	
	Date(){
		this.jour = Integer.parseInt(JOptionPane.showInputDialog("Entrez le jour"));
		this.mois = Integer.parseInt(JOptionPane.showInputDialog("Entrez le mois"));
		this.annee = Integer.parseInt(JOptionPane.showInputDialog("Entrez l'année"));
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public String toString(){
		return ("Date: "+this.jour+"/"+this.mois+"/"+this.annee);
	}
	
}
