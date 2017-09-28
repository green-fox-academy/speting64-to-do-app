import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeLines(Path myPath) {

        //Path myPath = Paths.get("C://Users/Viktorlukács/TodoApp/src/printusage.txt");
        myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/printusage.txt");

        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(myPath));
            //List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
            /*for (String line : lines) {
                System.out.println(line);
            }*/
        } catch (IOException ex) {
            ex.printStackTrace();
            //System.out.println("Unable to read file: my-file.txt");
        }
    }
}
