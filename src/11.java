import java.util.Scanner;
public class MyFirstJavaProgram {
   public static void main(String[] args) {
      System.out.println("Hello World");
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = sc.nextLine();
      System.out.println("Hello " + name);
   }
}