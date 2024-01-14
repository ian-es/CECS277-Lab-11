/*
Group 11
Ian Escalante
Julio Calderon

CECS 277 Lab 11
4/19/2022
*/

class Main {
  /* Program that creates unique ball objects to be rolled or bounced based on user input, and returns stats
  */
  public static void main(String[] args) {
    
    System.out.println("Choose a ball color (q to quit):");
    String ballInput = CheckInput.getString();
    
    while (!ballInput.equals("q")){
      Ball ball = Ball.getInstance(ballInput);
      System.out.println("1. Roll Ball\n2. Bounce Ball");
      int choice = CheckInput.getIntRange(1,2);
      if (choice ==1){
        ball.roll();
        System.out.println("You roll the " + ballInput + " ball.\n");
      }
      else if (choice == 2){
        ball.bounce();
        System.out.println("You bounce the "+ballInput+" ball.\n");
      }
      System.out.println(ball+"\n");
      
      System.out.println("Choose a ball color (q to quit):");
      ballInput = CheckInput.getString(); 
    }  
  }
}