import java.util.Scanner;
/* this class combines the necessary info and make it as concise for GamePlayer
*/
class PrePlayer extends MainMenu
{
  // this class should be the one of the only classes that gameplayer uses from
  Intermission intermission = new Intermission();
  public void mainMenu()
  {
  bigMain(intermission);
  }
  public void getScene1()
  {
    intermission.getBeginningPlot2();
    intermission.getBeginningPlot3();
    intermission.playerName();
  }
}
