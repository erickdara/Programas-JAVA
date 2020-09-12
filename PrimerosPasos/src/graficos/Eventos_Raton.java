package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco=new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRaton EventoRaton = new EventosDeRaton();
		
		addMouseListener(EventoRaton);
	}
}

class EventosDeRaton extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Has hecho click");
	}
	
}