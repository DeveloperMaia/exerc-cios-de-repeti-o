import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leitor = new Scanner (System.in);
		
		float num;
		
		System.out.println("Descubra se o valor digitado � positivo ou negativo! Digite-o:");
		num=leitor.nextFloat();
		
	if (num<0)
			System.out.println("Ele � negativo.");
		if (num>0)
			System.out.println("Ele � positivo.");
		
		if (num==0)
			System.out.println("Ele � neutro, � o n�mero ZERO.");
		
		
		
		
		
		
		
		

	}

}
