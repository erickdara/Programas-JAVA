package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		Empleados trabajador3=new Empleados("Biviana");
		
		Empleados trabajador4=new Empleados("Carlos");
		
		trabajador1.cambiaSeccion("RRHH");
			
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}
	
}
	class Empleados{
		
		public Empleados(String nom) {
			
			nombre=nom;
			
			seccion="Admnistración";
			
			Id=IdSiguiente;
			
			IdSiguiente++;
			
		}
		
		public void cambiaSeccion(String seccion) { //setter
			
			this.seccion=seccion;
		}
		
		
		public String devuelveDatos() { //getter
			
			return "El nombre es: " + nombre + " la seccion es " + seccion + " y el Id: " + Id;
		}
		
		public static String dameIdSiguiente() {
			return "El Id Siguiente es: " + IdSiguiente;
		}
		
		private final String nombre;
		
		private String seccion;
		
		private int Id;
		
		private static int IdSiguiente=1;
		
	}

