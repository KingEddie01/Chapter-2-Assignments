import java.util.Scanner;


public class Kilogram{


   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   
   System.out.print( "Enter pounds :  ");
   
   double pound = input.nextDouble();
   
   double kilogram = pound * 0.454;
   
   System.out.printf( "The Kilogram is %f%n", kilogram);
   
   
   }








}
