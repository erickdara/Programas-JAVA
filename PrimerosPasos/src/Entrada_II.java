import javax.swing.*;

public class Entrada_II {
	
	public static void main (String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Intriduce la edad, por favor");
		
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad_usuario+1) + " a�os");
		
	}
}
