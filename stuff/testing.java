import java.io.*;
import java.util.Scanner;
class testing
{
  static File file = new File("Saves//playerdata.txt");
  static public void savePlayerData(File savedata)
  {
    try
    {
        PrintWriter pw = new PrintWriter(savedata);
        pw.println("current health:20");
        pw.println("total health:20");
        pw.println("level:1");
        pw.println("gold:100");
        pw.println("experience:0");
        pw.close();
    } catch(FileNotFoundException exp)
    {
      System.out.println("error: " + exp.getMessage());

    }
  }
  static public String[] seperate(String savedata)
  {
    String [] array = savedata.split("[:\n]");
    return array;
  }
  static public int[] readPlayerData(File savedata)
  {
    String data = "";
    try
    {
      Scanner sc = new Scanner(savedata);
      while(sc.hasNextLine())
      {
        data += sc.nextLine() + "\n";
      }
      sc.close();
    } catch(FileNotFoundException exp)
    {
      System.out.println("error: " + exp.getMessage());
    }
    String [] array = seperate(data);
    int arraya[] = new int[30];
    int in = 0;
    for (int index = 1; index < array.length; index += 2) {
      arraya[in] = Integer.parseInt(array[index]);
      in++;
    }
    return arraya;
  }
  public static void main(String[] args) {

    savePlayerData(file);
    System.out.println(readPlayerData(file)[0]);
  }
}
