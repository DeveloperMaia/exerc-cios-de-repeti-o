import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		double soma=0;
		double a,b=0;
		
		System.out.println("Digite 20 valores seguidos:");
		do {
		
		a=leitor.nextDouble();
		soma=a+soma;
		b++;}
		while (b<20); 
		
		
		
		System.out.println("A soma deles é = "+(soma));
		System.out.println("E a média deles é = "+soma/20);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
