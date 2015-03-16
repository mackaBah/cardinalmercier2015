package tp7;

public class Date extends Affichable {
	
	private int jj;
	private int mm;
	private int aaaa;
	
	public Date(String dateS){
		String tabS[] = dateS.split("-");
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);		
	}
	
	public String toString(){
		return jj+"-"+mm+"-"+aaaa ;
	}
	public void affiche(){
		System.out.println(this);		
	}
	public static void main(String[] args) {
		Date d = new Date("14-12-2015");
		d.affiche();
	}
}
	