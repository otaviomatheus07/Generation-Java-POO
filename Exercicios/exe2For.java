package entregaDeExercicio;

import java.util.Scanner;

public class exe2For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, x, numPar=0, numImpar=0;
		for(x=0;x<10;x++) {
			System.out.println("\n Digte o "+(x+1)+"° numero");
			n1 = leia.nextInt();
			if(n1 % 2 == 0) {
				numPar++;
			}
			else if(n1 % 2 == 1) {
				numImpar++;
			}	
			
		}System.out.printf("\n Total de números Pares: %d",numPar);
		 System.out.printf("\n Total de números ImPares: %d",numImpar);
		
		
		
		
		
		

	}

}
