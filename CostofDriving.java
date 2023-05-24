import java.util.Scanner;


public class CostofDriving {

public static void main(String[] args) {


  	Scanner input = new Scanner(System.in);
  
  	System.out.print("Enter driving distance : ");
  
  	double drivingDistance = input.nextDouble();
  
  	System.out.print("Enter miles per gallon : ");
  
  	double milesPerGallon = input.nextDouble();
  
  	System.out.print("Enter prices per gallon : ");
  
  	double pricePerGallon = input.nextDouble();
  	
  	double costOfDriving = (drivingDistance * pricePerGallon)/milesPerGallon;
  	
  	
  	System.out.printf("Cost of Driving is %.2f%n", costOfDriving);
  








}

















}
