package DesenvolvimentoJava;

import java.util.Scanner;

public class exe5DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1=1, somaPar=0;
		do
		{
			System.out.println("Digite um número: ");
			n1 = leia.nextInt();
			if(n1 > 0)
			{
				somaPar+=n1;
				
			}
				
		}while(n1 >= 1 || n1 < 0);
		System.out.println("\n A soma dos números POSÌTIVOS é:  " +somaPar);

	}

}
