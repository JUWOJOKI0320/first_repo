import java.util.Scanner;

public class first{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, pretty girlfriend");
    int age = 51;
    double money = 31.22222;
    String people ="Joe";
    String scanned = input.nextLine();
    String statement;
    System.out.println(scanned);
    if (scanned .equals("male")){
      statement = "is not gay";}
    else{
      statement = "is gay";
    }
    System.out.println(people +" is " + age + " years old and he has " + money + " pesos and "+statement);
    int i=0;
    while(i<3){
      System.out.println("Tanginamo panget");
      i++;
    }
    switch(scanned){
      case "Male":
        System.out.println("Tanginamo Bading");
        break;
      case "Female":
        System.out.println("Tanginamo Tomboy");
        break;
      default:
        System.out.println("HAHA tanginamo");
        break;
    }
}
}