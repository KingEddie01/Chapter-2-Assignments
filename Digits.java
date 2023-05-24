import java.util.Scanner;

public class Digits{

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	
	int number = input.nextInt();
	
	int sumTotal = (number%10) + ((number/10)%10) + ((number/100)%10);
	
	System.out.printf("The sum of the digit is %d%n", sumTotal);
	
	
	
	




}








}
