import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner myObj = new Scanner(System.in);
    System.out.print("Your Age is : ");
    String age = myObj.nextLine();
    if (Integer.parseInt(age) >= 18) {
      System.out.println("You are Adult");
      System.out.print("Your favourite Fruit is : ");
      String Favorite = myObj.nextLine();
      System.out.println("I am packing a " + Favorite + " in your grocery");
    } else {
      System.out.println("You are Not Adult");
    }
  }
}