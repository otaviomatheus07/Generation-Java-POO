package entregaDeExercicio;

import java.util.Scanner;

public class exe4While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, sexo, genero,homeMobile40=0,pesBackend=0,mulFrontend=0,mulFullStack30=0;
		String add="S";
		while(add == "S") {
			System.out.println("\n Qual a sua idade: ");
			idade = leia.nextInt();

			System.out.println("\n Qual o seu genero: ");
			System.out.println("\n 1 - Masculino");
			System.out.println("\n 2 - Feminino");
			System.out.println("\n 3 - Outros");
			sexo = leia.nextInt();

			System.out.println("\n 1 - Backend ");
			System.out.println("\n 2 - Frontend ");
			System.out.println("\n 3 - Mobile ");
			System.out.println("\n 4 - FullStack ");
			genero = leia.nextInt();
			if(genero == 1 )
			{
				pesBackend++;
			}
			if(genero == 2 && sexo == 2 )
			{
				mulFrontend++;
			}
			if(genero == 3 && sexo == 1 && idade > 40)
			{
				homeMobile40++;
			}
			if(genero == 4 && sexo == 2 &&idade < 30)
			{
				mulFullStack30++;
			}

			System.out.println("Deseja Adcionar outro colaborador: S/N?: ");
			add = leia.next();
			
		}	
		System.out.println("\n Temos " +pesBackend + " pessoas desenvolvedoras Backend");
		System.out.println("\n Temos " +mulFrontend + " mulheres desenvolvedoras FrontEnd");
		System.out.println("\n Temos " +homeMobile40 + " homens desenvolvedores Mobile maiores de 40 anos");
		System.out.println("\n Temos " + mulFullStack30 + " mulheres desenvolvedoras FullStack menores de 30 anos");
	}


}
