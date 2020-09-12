public class CalculoHipotenusa {

public static void main(String args[]) {

int a=5;
int b=12;

double c=Math.sqrt((Math.pow(a, 2))+(Math.pow(b, 2)));

System.out.println("la hipotenusa es: "+ c);

//area de un circulo

final double pi=3.1415;
int radio=10;

double area = pi * Math.pow(radio, 2);

System.out.println("El area del circulo es: " + area);


}
}