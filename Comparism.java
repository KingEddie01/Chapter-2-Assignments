import java.util.Scanner; 

public class Comparism {

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

	System.out.print ( "Enter valueX : ");

 	int valueX = input.nextInt();

	System.out.print( "Enter  valueY : ");

	int valueY = input.nextInt();

	if(valueX == valueY) {

	System.out.printf("%d == %d%n", valueX, valueY);
}
	if(valueX!=valueY){

	System.out.printf( "%d != %d%n", valueX, valueY);
}
	if(valueX<valueY){

	System.out.printf("%d < %d%n", valueX, valueY);
}
	if(valueX>valueY){

	System.out.printf("%d > %d%n", valueX, valueY);
}
	if(valueX<=valueY){

	System.out.printf("%d <= %d%n", valueX, valueY);
}
	if(valueX>=valueY){

System.out.printf("%d >= %d%n", valueX, valueY);

}





}









}
