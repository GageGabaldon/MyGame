// intermission combines menu_story and choice and will be used in PrePlayer.
class Intermission
{
  MenuStorys menu_story = new MenuStorys();
  Choices choi = new Choices();
  Player plyr = new Player();
  Scanner sc = new Scanner(System.in);
  // this will set up the very beginningPlot.
  public void beginningPlot()
  {
    System.out.println(menu_story.getStartPlot());
    choi.tavernChoice();
    if(choi.getAnswerGiven() == "No i will pass")
    {
      // this displays a false ending if the user says no to the old man
      sleepThread();
      System.out.println(menu_story.theEnd());
      System.exit(0);
    }
  }
  public void getBeginningPlot2()
  {
    sleepThread();
    System.out.println(menu_story.getScene("Scene1.txt"));

  }
  public void getBeginningPlot3()
  {
    sleepThread();
    System.out.println(menu_story.getScene("Scene2.txt"));
  }
  public void playerName()
  {
    System.out.println(menu_story.getScene("YourName.txt"));
    plyr.setName(sc.nextLine());
    

  }
  public void sleepThread()
  {
    try { Thread.sleep(5000);}
    catch (InterruptedException ex){}
  }
}
