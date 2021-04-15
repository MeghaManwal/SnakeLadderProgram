import java.util.Scanner;

public class SnakeLadderWinUC4
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to Snake Ladder Game" );
  System.out.println("Press 1 to start the Single player Game: ");
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
        if( n==1)
        {
         System.out.println("You are at Position 0 ");
        }
        else
        {
         System.out.println("Invalid Input");
        }

 int new_Position=0;
 while(new_Position<=100)
  {
    new_Position++;

    int Roll=(int) Math.floor((Math.random()*10) % 6 +1);
      System.out.println("Value on the Die: "+Roll);

    int Option=(int) Math.floor(Math.random()*10) % 3;

       switch (Option)
      {
       case 0:
       System.out.println("No play :You stays at same position as you are");
       new_Position=new_Position-1 ;
       System.out.println("You reached at POSITION: "+new_Position);
       break;

       case 1:
       System.out.println("Ladder :You move ahead by :"+Roll);
       new_Position=(new_Position + Roll-1);
       System.out.println("You reached at POSITION: "+new_Position);
       break;

       case 2:
       System.out.println("Snake :You move behind by :"+Roll);
       new_Position=(new_Position - Roll-1);
       System.out.println("You reached at POSITION: "+new_Position);
       break;
      }
    }

  }
}

