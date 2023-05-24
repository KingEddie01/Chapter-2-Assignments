import java.util.Scanner;

public class Energy {
 
 	public static void main(String[] args) {
  
	Scanner input = new Scanner(System.in);
  
  
  	System.out.print("Enter weight of Water (M): ");
  
  double weightOfWater  = input.nextDouble(); 
  
  	
  
  System.out.print("Enter Initial Temperature : ");
  
  double initialTemperature = input.nextDouble();
  
  System .out.print( "Enter Final Temperature : ");
  
  double finalTemperature = input.nextDouble();
  
  double energyNeeded = weightOfWater * (finalTemperature - initialTemperature) * 4184;
  
  
  System.out.printf( "The Energy needed is %.1f%n", energyNeeded);
  
  
  }
 
 
 }
