package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto mimarco=new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(600,300,600,350);
		
		LaminaTexto milamina=new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto() {
		
		campo1=new JTextField(20);
		
		add(campo1);
		
		JButton miboton=new JButton("Dale");
		
		DameTexto mievento=new DameTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(campo1.getText().trim());
		} 
	}
	
	private JTextField campo1;
}
