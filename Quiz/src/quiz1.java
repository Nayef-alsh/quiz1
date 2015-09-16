import java.util.Scanner;
	public class quiz1 {
		public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		double ATT,COMP,YDS,TD,INT;
		System.out.println("What is the number of passing attempts?");
		ATT = Input.nextDouble();
		System.out.println("What is the number of completions ?");
		COMP =Input.nextDouble();
		System.out.println("What is the number of passing yeards?");
		YDS = Input.nextDouble();
		System.out.println("What is the number of touchdown passes?");
		TD = Input.nextDouble();
		System.out.println("What is the number of Interceptions?");
		INT = Input.nextDouble();
		double a =(COMP/ATT -0.3) * 5;
		double b = (YDS/ATT - 3)*.25;
		double c =(TD/ATT)*20;
		double d = 2.375 - (INT/ATT) * 25;
		double PasserRating = ((a+b+c+d)/6)* 100;
		System.out.printf("The passer rating is %.2f",PasserRating);

		

		}
	}


