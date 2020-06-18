package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class TestTimer {

	public static void main(String[] args) {

		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
	}

}

class Reloj{
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
			class DameLaHora implements ActionListener{
			
			public void actionPerformed(ActionEvent evento) {
			Date ahora=new Date();
		    System.out.println("Coloco la hora cada 3 Segundos: " + ahora);
		    if(sonido) {
		    	Toolkit.getDefaultToolkit().beep();
		    	}
		    	
			}
		}
		
		ActionListener oyente=new DameLaHora();
		
		Timer mitimer = new Timer(intervalo, oyente);
		
		mitimer.start();
	}
		
}