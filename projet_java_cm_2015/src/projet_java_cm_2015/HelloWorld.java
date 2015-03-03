package projet_java_cm_2015;
import javax.swing.JOptionPane;
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World !\n");
		System.out.println("Hello"+" "+"World!");
		int a=1;int b=5;int som=0;
	//	som = a+b;
		JOptionPane. showMessageDialog(null, "message type 0", "title 0", 0);
		JOptionPane. showMessageDialog(null, "message type 1", "title 1", 1);
		JOptionPane. showMessageDialog(null, "message type 2", "title 2", 2);
		JOptionPane. showMessageDialog(null, "message type 3", "title 3", 3);
		JOptionPane. showConfirmDialog(null, "message type 0", "title 0", 0);
		JOptionPane. showConfirmDialog(null, "message type 1", "title 1", 1);
		JOptionPane. showConfirmDialog(null, "message type 2", "title 2", 2);
		som= Integer.parseInt(JOptionPane.showInputDialog("Entrez le resutat de "+a+"+"+b));
		if(som==a+b){
			JOptionPane. showMessageDialog(null, "message type 1 ou information", "Bravo", 1);
		}else
		{
			JOptionPane. showMessageDialog(null, "message type 0 ou erreur", "Erreur", 0);
		}
		//JOptionPane. showConfirmDialog(null, "message type 4", "title 4", 4);
		//String nom = JOptionPane. showInputDialog("Donnez-moi votre nom : ");
		}
}