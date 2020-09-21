package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFondo mimarco=new MarcoFondo();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoFondo extends JFrame{
	
	public MarcoFondo() {
		
		setVisible(true);
		
		setBounds(300,300,600,450);
		
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		boton1=new JButton();
		
		boton2=new JButton();
		
		cuadro1.setBounds(120,10,150,20);
		
		cuadro2.setBounds(120,50,150,20);
		
		boton1.setBounds(120,70,150,20);
		
		boton2.setBounds(120,100,150,20);
		
		add(cuadro1);
		
		//add(cuadro2);
		
		add(boton1);
		
		add(boton2);
		
		DetectaFocos elFoco=new DetectaFocos();
		
		cuadro1.addFocusListener(elFoco);
	}
	
	//Clases Oyente

	private class DetectaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String email=cuadro1.getText();
			
			boolean comprobacion=false;
			
			for(int i=0; i<email.length(); i++) {
				
				if (email.charAt(i)=='@') {
					
					comprobacion=true;
				} 
			}
			
			if(comprobacion) {
				System.out.println("Correcto");
			}
			else {
				System.out.println("Incorrecto");
			}
		}
	}
	
		JTextField cuadro1;
		
		JTextField cuadro2;
		
		JButton boton1;
		
		JButton boton2;
}


