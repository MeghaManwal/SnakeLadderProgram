import java.util.Scanner;

public class SnakeLadderOptionUC3
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
     int Roll=(int) Math.floor((Math.random()*10) % 6 +1);
       System.out.println("Value on the Die: "+Roll);

   int Option=(int) Math.floor(Math.random()*10) % 3;
   switch (Option) {
   case 0:
   System.out.println("No play :You stays at same position as you are");
   break;

   case 1:
   System.out.println("Ladder :You move ahead by :"+Roll);
   break;

   case 2:
   System.out.println("Snake :You move behind by :"+Roll);
   break;
   }

  }
}

