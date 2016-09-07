import java.util.Scanner;
public class Average{
//the lines are for notes//

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  /*int x = 3;
   double number = 3.0;
   String word = "nfkdnfd";
   char letter = 'x';
   */
    System.out.println("Enter 3 number");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble(); 
    double num3 = input.nextDouble();
    
    double average = (num1 + num2 + num3)/3;
    
    System.out.println("This is the average" + average);
  
  
  
  }

}