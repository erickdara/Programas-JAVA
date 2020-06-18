package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado empleado1=new Empleado("Erick Rangel", 85000, 1990, 12,17);
		
		Empleado empleado2=new Empleado("Mateo Rangel", 95000, 1995, 6,2);
		
		Empleado empleado3=new Empleado("Valentina Rangel", 105000, 1992, 8,13);
		
		empleado1.subeSueldo(5);
		
		empleado1.subeSueldo(5);
		
		empleado1.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
				+ " Fecha de Alta: " + empleado1.dameFechaCoontrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de Alta: " + empleado2.dameFechaCoontrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de Alta: " + empleado3.dameFechaCoontrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Erick", 55000, 2020, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2500);
		
		Empleado[] misEmpleados=new  Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12 , 17);
		
		misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 6 , 2);
		
		misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 3 , 15);
		
		misEmpleados[3]=new Empleado("Erick Rangel");
		
		misEmpleados[4]=jefe_RRHH; // Polimorfismo en acción. Principio de sustitución
		
		misEmpleados[5]=new Jefatura ("Maria", 95000, 1999,5,26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);

		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " +
		jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+ " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		for(Empleado emple: misEmpleados) {
			
			emple.subeSueldo(5);
		}
		
		/*for(int i=0; i<3; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
					+ " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		Arrays.sort(misEmpleados);
		
		for(Empleado emple: misEmpleados) {
			System.out.println("Nombre: " + emple.dameNombre()
					+ " Sueldo: " + emple.dameSueldo()
					+ " Fecha de Alta: " + emple.dameFechaContrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue,int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado(String nom) {
		this(nom,30000, 2000,01, 01);
	}
	
	public String dameNombre() { //getter
		
		return nombre +" Id:"+ Id;
	}
	
	public double dameSueldo() { //getter
		
		return sueldo;
	}
	
	public Date dameFechaContrato() {  //getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente=1;
	
	private int Id;
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public String tomar_decisiones(String decision) {
		 
		return "Un miembro de la dirección ha tomado la decisión de: " + decision; 
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
}

class Director extends Jefatura{
	public Director(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
}
