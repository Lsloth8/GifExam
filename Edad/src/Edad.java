import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner (System.in);
		int edad;
		
		System.out.println("Introduzca su edad: ");
		edad = leer.nextInt();
		
		if (edad<=12) {
			System.out.println("Es usted un niño");
		} else if(edad>12 & edad<=18) {
			System.out.println("Es usted un adolecente");
		} else if (edad>18 & edad<=65 ) {
			System.out.println("Es usted un adulto");
		}else if(edad>65){
			System.out.println("es usted un anciano");
		}
		
		
		System.out.println("Gracias");

	}

}
