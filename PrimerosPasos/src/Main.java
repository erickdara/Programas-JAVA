import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		String fuente = JOptionPane.showInputDialog("Introduce Fuente");

		boolean estalafuente = false;

		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String nombredelafuente : nombresDeFuentes) {

			if (nombredelafuente.equals(fuente)) {

				estalafuente = true;
			}

		}
		if (estalafuente) {

			System.out.println("Fuente Instalada");
		} else {
			System.out.println("No esta instalada la fuente");
		}

	}
}