import java.io.*;

// this class can read and write files and will be used in conjunction with story
class TestRead
{
  String finished = "";
  public String ReadFile(String input)
  {
    finished = "";
    try
    {

            FileReader reader = new FileReader("TheText/" + input);
            BufferedReader bufferedReader = new BufferedReader(reader);
            // can also use scanner for the above statement

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
              finished += line + "\n";
            }
            reader.close();
            return finished;
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return finished;
  }

  public void savePlayerData(File savedata)
  {
    try
    {
        PrintWriter pw = new PrintWriter(savedata);
        pw.println("current health 20");
        pw.println("total health 20");
        pw.println("level 1");
        pw.println("gold 100 ");
        pw.println("experience 0");
        pw.close();
    } catch(FileNotFoundException exp)
    {
      System.out.println("error: " + exp.getMessage());

    }
  }
  static public void readData(File savedata)
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
  }
  public void OverWriteFile(String inputfile, String text)
  {
      try
      {
      PrintWriter pw = new PrintWriter(inputfile);
      pw.print("mickey");
      pw.print(12);
      pw.println();
      pw.flush();

      pw.print("my");
      pw.print(190);
      pw.println();
      pw.close();

      }
      catch(FileNotFoundException exp)
      {
          System.out.println("error: " + exp.getMessage());
      }
  }

  public void appendWriteFile(String input, String text)
  {
    try
    {
        FileWriter fw = new FileWriter(input, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.print("ree");
        pw.println();
        pw.close();
    }
    catch(FileNotFoundException e)
    {
        System.out.println("error: " + e.getMessage());
    }
    catch (IOException e)
    {
        System.out.println("" + e.getMessage());
    }
  }
}
