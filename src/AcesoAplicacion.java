import javax.swing.*;
public class AcesoAplicacion {

	public static void main(String[] args) {

		String clave= "Edwin";
		String pass="";
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contrase�a");
		if (clave.equals(pass)==false) {
			
			System.out.println("contrase�a incorrecta");
			}
		
		}
		System.out.println("contrase�a correcta");

	}

}
