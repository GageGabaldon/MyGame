import java.util.Scanner;
/* this class make PrePlayer less bloated and is only used to make the mainMenu
*/
class MainMenu
{
  public void bigMain(Intermission inter)
  {
    System.out.println("Welcome to the Wonderful world of ... ");
    System.out.println("A game by Gage");
    System.out.println("");
    System.out.println("");
    System.out.println("New game");
    System.out.println("Load game");
    System.out.println("Exit");
    System.out.println("");
    System.out.print("Choose an option: ");
    boolean correct_answer = false;
    Scanner sc = new Scanner(System.in);
    while(!correct_answer)
    {
      String user_in = sc.nextLine();
      user_in = user_in.toLowerCase();
      user_in = user_in.trim();
      if((user_in.equals("new game")) || (user_in.equals("n")))
      {
       correct_answer = true;
       for (int line_space = 0; line_space < 50 ; line_space++)
       {
         System.out.println(" ");
       }
       inter.beginningPlot();
      }
      if(user_in.equals("load game") || user_in.equals("l"))
      {
        correct_answer = true;
        System.exit(0);
      }
      if(user_in.equals("exit") || user_in.equals("e"))
      {
        correct_answer = true;
        System.exit(0);
      }
      else if(!correct_answer)
      {
        System.out.print("Please choose a correct option: ");
      }
    }
  }
}
