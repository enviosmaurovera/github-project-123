import java.util.*;
public class GithubProject123 {
    public static void main(String[] args) {
        int number = 1;
        String result = "";
        while (number <= 50) {
            if (number % 3 == 0 && number % 5 == 0) {
                result += "FizzBuzz";
            } else if (number % 3 == 0) {
                result += "Fizz";
            } else if (number % 5 == 0) {
                result += "Buzz";
            } else {
                result += number;
            }
            number++;
        }
        System.out.println(result);
    }
}