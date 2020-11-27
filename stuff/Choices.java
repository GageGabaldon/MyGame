/* this class sets up the PreloadChoice  and makes it easy to call from
 * intermission */

class Choices extends PreloadChoice
{
  public void tavernChoice()
  {
    String[] arrayoffiles = {"Continueadventure.txt", "Imdone.txt"};
    setChoices("Yes let me hear it.", "No i will pass");
    actionChoices("OpeningPrebanter.txt", arrayoffiles);

  }

}
