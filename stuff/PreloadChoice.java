import  java.util.Scanner;
/* this class will be used when the user needs to pick out of a few options
 * and we will be using it a lot */
class PreloadChoice
{
  MenuStorys prebanter = new MenuStorys();
  // this class is used to create a menu for different choices
  private String first_right_string;
  private String second_right_string = "";
  private String third_right_string = "";
  private String answer_given;
// different overloaded setChoices for as many choices as needed
  public void setChoices(String first_choice)
  {
    first_right_string = first_choice;
  }

  public void setChoices(String first_choice, String second_choice)
  {
    first_right_string = first_choice;
    second_right_string = second_choice;
  }

  public void setChoices(String first_choice, String second_choice, String third_choice)
  {
    first_right_string = first_choice;
    second_right_string = second_choice;
    third_right_string = third_choice;
  }

  public void setAnswerGiven(String answer)
  {
    answer_given = answer;
  }
  public String getAnswerGiven()
  {
    return answer_given;
  }

  public void actionChoices(String thing, String[] arrayoffiles)
  {
    Story prebanter = new MenuStorys();
    threadSleep(10000);
    System.out.println(prebanter.getPreBanter(thing));
    System.out.println("1. " + first_right_string);
    if(second_right_string != "")
    {
      System.out.println("2. " + second_right_string);
    }
    if(third_right_string != "")
    {
      System.out.println("3. " + third_right_string);
    }
    boolean correct_answer = false;
    Scanner sc = new Scanner(System.in);
    while(!correct_answer)
    {
      String user_in = sc.nextLine();
      user_in = user_in.toLowerCase();
      user_in = user_in.trim();
      if((user_in.equals(first_right_string)) || (user_in.equals("1")) ||
      (user_in.equals(first_right_string.substring(0, 1))))
      {
       correct_answer = true;
       System.out.println(prebanter.possibleChoice(arrayoffiles[0]));
       setAnswerGiven(first_right_string);
      }
      if(second_right_string != "")
      {
        if(user_in.equals(second_right_string) || user_in.equals("2") ||
        user_in.equals(second_right_string.substring(0, 1)))
        {
          correct_answer = true;
          System.out.println(prebanter.possibleChoice(arrayoffiles[1]));
          setAnswerGiven(second_right_string);
        }
      }
      if(third_right_string != "")
      {
        if(user_in.equals(third_right_string) || user_in.equals("3") ||
        user_in.equals(third_right_string.substring(0, 1)))
        {
          correct_answer = true;
          System.out.println(prebanter.possibleChoice(arrayoffiles[2]));
          setAnswerGiven(third_right_string);
        }
      }
      else if(!correct_answer)
      {
        System.out.print("Please choose a correct option: ");
      }
    }
  }
// special function that sets the sleep_time of the code to pace out the text boxes
  public void threadSleep(int sleep_time)
  {
    try
    {
      Thread.sleep(sleep_time);
    }
    catch (InterruptedException ex)
   {
     // do nothing
   }
  }
}
