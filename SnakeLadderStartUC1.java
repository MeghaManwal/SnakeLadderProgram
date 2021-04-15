import java.util.Scanner;

public class SnakeLadderStartUC1 
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to Snake Ladder Game" ); 
  System.out.println("Press 1 to start the Single player Game: "); Scanner 
  s=new Scanner(System.in); int n=s.nextInt(); 
  if( n==1) 
  System.out.println("You are at Position 0 ");
  else
  System.out.println("Invalid Input");
 }
}

