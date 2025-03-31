import java.util.ArrayList;
import java.util.List;

public class MyFirstGitHubProject {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("David");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
