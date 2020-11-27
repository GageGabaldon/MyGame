import java.util.ArrayList;
// story will be used to help set up Menu story and to put to use TestRead.
class Story extends TestRead
{
  String str = "";

    public String getStartPlot()
    {
      // must keep the text under 78 characters long. Approx length
                    // ******************************************************************************
      str = ReadFile("Opening.txt");
      return str;
    }
    public String getScene(String scen)
    {
      str = ReadFile(scen);
      return str;
    }

  public String getPreBanter(String words)
  {
    str = "";
    str = ReadFile(words);
    return str;
  }

  public String possibleChoice(String whatever_choice)
  {
    str = "";
    str = ReadFile(whatever_choice);
    return str;
  }
  public String getBackstory(String whatever_choice)
  {
    str = "";
    str = ReadFile(whatever_choice);
    return str;
  }

  public String theEnd()
  {
    str = "";
    str = ReadFile("TheEnd1.txt");
    return str;
  }
}
// combines menu and story giving you a text that is in a menu
class MenuStorys extends Story
{
  Menus menu = new Menus();
  String print_out;

  public String getStartPlot()
  {
    print_out = "";
    // creates a box and puts the text in story in it
    print_out = menu.CreateBox(super.getStartPlot());
    return print_out;
  }
  public String getScene(String scen)
  {
    print_out = "";
    print_out = menu.CreateBox(super.getScene(scen));
    return print_out;
  }
  public String possibleChoice(String whatever_choice)
  {
    print_out = "";
    print_out = menu.CreateBox(super.possibleChoice(whatever_choice));
    return print_out;
  }
  public String theEnd()
  {
   print_out = "";
   print_out = menu.CreateBox(super.theEnd());
   return print_out;
  }
}
