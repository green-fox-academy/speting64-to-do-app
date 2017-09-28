import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ToDoApp {


    List<String> content = new ArrayList<>();

    public void openFile() {

        this.content = new ArrayList<>();
        content.add("\t\t\t\t\"Command Line Todo application\\n\" +\n" +
                "                \"=============================\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Command line arguments:\\n\" +\n" +
                "                \"-l   Lists all the tasks\\n\" +\n" +
                "                \"-a   Adds a new task\\n\" +\n" +
                "                \"-r   Removes a task\\n\" +\n" +
                "                \"-c   Completes a task\");");
        try {

            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/printusage.txt");
            Files.write(myPath, content);

        } catch (IOException ex) {
            System.out.println("Unable to read file");
        }
    }

    public void listTasks() {

        try {
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/printusage.txt");
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException ex) {

            System.out.println("Unable to read file");
        }
    }

    public static void main(String[] args) {

        boolean toDo = true;

        ToDoApp one = new ToDoApp();
        one.openFile();
        one.listTasks();

        ListTask listing = new ListTask();

        listing.addStuff("Walk the dog");
        listing.addStuff("Buy Milk");
        listing.addStuff("Do Homework");

        while (toDo) {

            Scanner sc = new Scanner(System.in);
            String newInput = sc.nextLine();

            if (newInput.equals("")) {
                one.openFile();
            }else if (newInput.substring(0, 2).equals("-a") && newInput.length() > 3) {
            listing.addStuff(newInput.substring(3));
            }else if (newInput.substring(0, 2).equals("-a") && newInput.length() < 3) {
            System.out.println("No task provided");
            }
            /*else if(newInput.substring(0,2).equals("-l")&&listing.check() != 0){
                listing.
            }*/
            else if (newInput.substring(0, 2).equals("-l") && listing.check() == 0) {
            System.out.println("No todos today");
            }else if (newInput.substring(0, 2).equals("-r") && listing.check() >= (parseInt(newInput.substring(3, 4)))){
            listing.removeElement(parseInt(newInput.substring(3, 4)));
            }
        }
    }
}


