package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual � o primeiro n�mero?");
		n1 = input.nextInt();
		System.out.println("Qual � o segundo n�mero?");
		n2 = input.nextInt();
		
		System.out.println("Soma : "+(n1+n2));
		System.out.println("Subtra��o: "+(n1-n2));
		System.out.println("Multiplica��o: "+(n1*n2));
		System.out.println("Divis�o: "+(n1/n2));
	}

}
