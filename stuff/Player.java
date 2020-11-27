import java.util.Scanner;
// this class will set up the player and we will be using it later.
class Player {
  TestRead tr = new TestRead();
  Scanner sc = new Scanner(System.in);
  static public void seperate(String savedata)
  {
    String [] array = savedata.split("[:\n]");
    for(String a:array){System.out.println(a);}
  }
  static public void readPlayerData(File savedata)
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
      seperate(data);
      System.out.println(data);
    } catch(FileNotFoundException exp)
    {
      System.out.println("error: " + exp.getMessage());
    }
  }
  private String main_character;
  private int total_health;
  private int remaining_health;
  private int gold;
  private int level;
  private double experience;
  private int starting_g;
  private int starting_health_rem;
  private int starting_total_health;
  private int starting_level;


  public Player(){
    total_health = starting_total_health;
    remaining_health = starting_health_rem;
    gold = starting_g;
    level = starting_level;
  }
  public Player(File saveFile)
  {
    tr.


  }
  public int getGold(){
    return gold;
  }
  public int setGold(int Gold){
    gold = Gold;
    return gold;
  }
  public int getLevel(){
    return level;
  }
  public int setLevel(int Level){
    level = Level;
    return level;
  }
  public double getExperience(){
    return experience;
  }
  public double setExperience(int exp){
    experience = exp;
    return experience;
  }
  public int getRemHealth(){
    return remaining_health;
  }
  public int setRemHealth(int rem_health){
    remaining_health = rem_health;
    return remaining_health;
  }
  public int getTotalHealth(){
    return total_health;
  }
  public int setTotalHealth(int tot_health){
    total_health = tot_health;
    return total_health;
  }
  public String Health(){
    return getRemHealth() + " / " + getTotalHealth();
  }
  public void setName(String nme)
  {
    main_character = nme;
  }
  public String getName()
  {
    return main_character;
  }
}
