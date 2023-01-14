package entregaDeExercicio;

import java.util.Scanner;

public class AbonoSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, res;
		
		System.out.println("Digite um número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite um número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite um número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite um número: ");
		n4 = leia.nextFloat();
		
		res = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença entre são de: "+ res);
		
		
		
		
		
		
		
		
		
		//EXERCICIO 3
		/*
		float salario, addN, horasEx, desconto, res;
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu adcional noturno: ");
		addN = leia.nextFloat();
		
		System.out.println("Digite o valor da horas extras: ");
		horasEx = leia.nextFloat();
		
		System.out.println("Digite seu desconto: ");
		desconto = leia.nextFloat();
		
		res = salario + addN + (horasEx * 5) - desconto;
		
		System.out.println("O valor a receber é: " + res);
		*/
		
		
		
		
		
		
		
		
		// EXERCICIO 2
		/*
		int nota1, nota2, nota3, nota4, media;
		System.out.println("Aluno 1 entre com a primeira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Aluno 2 entre com a primeira nota: ");
		nota2 = leia.nextInt();
		
		System.out.println("Aluno 3 entre com a primeira nota: ");
		nota3 = leia.nextInt();
		
		System.out.println("Aluno 4 entre com a primeira nota: ");
		nota4 = leia.nextInt();
		
		media = (nota1 + nota2+nota3+nota4)/4;
		
		System.out.println("A media dos alunos é de: "+ media);
		*/
				
// exercicio 1		
		/*
		float salario, abono, res;
		
		System.out.println("Digite seu Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o seu Abono: ");
		abono = leia.nextFloat();
		
		res = salario + abono;
		
		System.out.println("O seu salário mais o abono é de: " + res);
		*/
	}

}
