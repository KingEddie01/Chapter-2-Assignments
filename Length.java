import java.util.Scanner;

public class Length {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter speed : ");
        
        double speed = input.nextInt();
        
        System.out.print("Enter acceleration : ");
        
        double acceleration = input.nextDouble();
        
        double length = (speed * speed)/(2*acceleration);
        
        System.out.printf("The Length is %.3f%n", length);
        
    
    
    
    
    
    
    
    
    }
    
    
    
    }
