import java.util.HashMap;

class Ball {
  private static HashMap<String, Ball> colors = new HashMap<String,Ball>();
  private String color;
  private int bounces;
  private int rolls;


  /* Default constructor for Ball
  @param c String color of the new Ball
  */
  private Ball(String c){
    color = c;
    bounces = 0;
    rolls = 0;
  }

  /* Creates a singleton instance of Ball in the HashMap colors
  @param c String color of ball to be accessed/added
  @return instance of Ball singleton in HashMap colors
  */
  public static Ball getInstance(String c){
    if (!colors.containsKey(c)){
      colors.put(c,new Ball(c));
    }
    return colors.get(c);
  }

  /* Increments the ball bounce count by 1.
  */
  public void bounce(){
    bounces += 1;
  }

  /* Increments the ball roll count by 1.
  */
  public void roll(){
    rolls += 1;
  }
  /** Returns the ball color along with its roll and bounce count.
    @return Ball color, rolls, and bounces
  **/
  
  public String toString(){
    return color + " Ball:" + "\n-------\n" + "Rolls: " + rolls + "\n" + "Bounces: " + bounces;
  }
  
}
