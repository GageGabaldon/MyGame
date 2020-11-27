import java.util.Scanner;
/* the final boss of classes this will be the class that you call and will
as little objects as possible to run the game*/
class GamePlayer
{
  public static void main(String[] args)
  {
    Player user = new Player("Jeff");
    PrePlayer preplay = new PrePlayer();
    preplay.mainMenu();
    preplay.getScene1();
  }
}
