import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		int num, soma=0, a=0,maior=0, b=0;
		System.out.println("Digite 15 valores:");
		while (b<15) {
		num=leitor.nextInt();
		b++;
		
		if(num>maior) {
			maior=num;}
		
		
		else if(num<maior) { 
			maior=maior;}
		}
	
		System.out.println("Maior número fornecido: "+maior);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
