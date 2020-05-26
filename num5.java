import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		double salr=1000, salr2=0, altura, media, soma=0, menor=3, maior=0;
		String genero;
		int cont=1, cont1000=0;
		
		do {
			System.out.println("Digite se é um Homem(M) ou uma Mulher(F):");
			genero=leitor.next();
			System.out.println("Digite a quantia do salário em R$:");
			salr2=leitor.nextDouble();
			System.out.println("Digite a altura em metros (Ex.:1,7):");
			altura=leitor.nextDouble();
			cont++;
			soma=soma+salr2;
			media=soma/20;
			
			if(altura>maior) {
				maior=altura;
			}
			if(altura<menor) {
				menor=altura;
			}
			
			if (salr2<salr && genero.contentEquals("F")) { 
				cont1000++;}}
			
			while(cont<=20);
		    System.out.printf("Média de salário do grupo: %2f:\n",media);
		    System.out.println("O mais alto do grupo tem:"+maior+" metros, e o mais baixo tem:"+menor+"metros.");
		    System.out.println("Mulheres com salário até 1000R$: "+cont1000);
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	{{
		
		
	}

}}
