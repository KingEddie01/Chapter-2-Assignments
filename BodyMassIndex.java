import java.util.Scanner;

public class BodyMassIndex{

   public static void main(String[] args) {
   
  
       Scanner input = new Scanner(System.in);
   
       System.out.print("Enter weight: ");
       
       double weight = input.nextDouble();
       
       System.out.print("Enter height: ");
       
       double height = input.nextDouble();
       
       double bodyMassIndex = (weight *0.45359237) / ((height*0.0254) * (height*0.0254));
       
       System.out.printf("The Body Mass Index is %f%n", bodyMassIndex);
        
   
   }
   
 }
