import java.util.Scanner;
// has the text box function we will be using to display text and for random
// elements.
class Menus
{
  Scanner sc = new Scanner(System.in);
   String dice;
   boolean correct_answer = false;
   final int maxCharLength = 78;
   public String CreateBox(String s){

     String text_box;
     text_box = "";
     //80 Chars
     text_box += "****************************************";
     text_box += "**************************************** \n";
     // splits the text in story into lines to be used in the array
     String[] text_box_v2 = s.split("\n");
     int arrayLength = text_box_v2.length;
     for(short ele_of_array = 0; ele_of_array < arrayLength; ele_of_array++)
     {
       // changes the text to fit into a text box by adding " "
       String shorten_array = text_box_v2[ele_of_array];
       while(shorten_array.length() != maxCharLength)
       {
         shorten_array = shorten_array + " ";
       }
       text_box += "|" + shorten_array + "| \n";
     }
      text_box += "****************************************";
      text_box += "**************************************** \n";
      return text_box;
   }
   /*
   public void Valid(String s)
   {
     if (s.length > 78)
     {
     }
   }
   */
// function that will be used later to display the random choices.
  public String Dice(int number)
  {
    dice = "";
    if(number == 1)
    {
      dice += "***************\n";
      dice += "*             *\n";
      dice += "*             *\n";
      dice += "*      #      *\n";
      dice += "*             *\n";
      dice += "*             *\n";
      dice += "***************\n";
    }
    if(number == 2)
    {
      dice += "***************\n";
      dice += "*  #          *\n";
      dice += "*             *\n";
      dice += "*             *\n";
      dice += "*             *\n";
      dice += "*          #  *\n";
      dice += "***************\n";
    }
    if(number == 3)
    {
      dice += "***************\n";
      dice += "*  #          *\n";
      dice += "*             *\n";
      dice += "*      #      *\n";
      dice += "*             *\n";
      dice += "*          #  *\n";
      dice += "***************\n";
    }
    if(number == 4)
    {
      dice += "***************\n";
      dice += "*  #       #  *\n";
      dice += "*             *\n";
      dice += "*             *\n";
      dice += "*             *\n";
      dice += "*  #       #  *\n";
      dice += "***************\n";
    }
    if(number == 5)
    {
      dice += "***************\n";
      dice += "*  #       #  *\n";
      dice += "*             *\n";
      dice += "*      #      *\n";
      dice += "*             *\n";
      dice += "*  #       #  *\n";
      dice += "***************\n";
    }
    if(number == 6)
    {
      dice += "***************\n";
      dice += "*   #     #   *\n";
      dice += "*             *\n";
      dice += "*   #     #   *\n";
      dice += "*             *\n";
      dice += "*   #     #   *\n";
      dice += "***************\n";
    }
    return dice;
  }
}
