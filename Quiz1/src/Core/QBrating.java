package Core;
import java.util.Scanner;

public class QBrating {
	
	public static void main(String[] args) {
		Scanner stats = new Scanner(System.in);
		//prompt user for input
		System.out.println("Enter Number of Pass Attempts: ");
		double PA = stats.nextDouble();
		System.out.println("Enter Number of Completions: ");
		double COMP = stats.nextDouble();
		System.out.println("Enter Number of Total Yards: ");
		double YRDS = stats.nextDouble();
		System.out.println("Enter Number of Touchdowns: ");
		double TD = stats.nextDouble();
		System.out.println("Enter Number of Interceptions: ");
		double INTS = stats.nextDouble();
		stats.close();
		
		//calculate rating
		double a = (COMP/PA - 0.3)*5;
		double b = (YRDS/PA - 3)*0.25;
		double c = (TD/PA)*20;
		double d = 2.375 - (INTS/PA*25);
		double Rating = ((a+b+c+d)/6)*100;
		//is QB rating in valid range
		if (Rating < 0) {
			Rating = 0;
		}
		if (Rating > 158.3) {
			Rating = 158.3;
		}
		//display output
		System.out.printf("The Quarterback Rating is: %.1f",Rating);
	}
}
