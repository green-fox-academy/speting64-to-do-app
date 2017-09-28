import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTask {

   java.util.List<String> tasks = new ArrayList<>();

    public void Listing(){

        this.tasks = new ArrayList<>();
        this.tasks.add("");
        try{
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/taskstodo.txt");
            Files.write(myPath, this.tasks);
        }catch(IOException ex){
            System.out.println("Unable to read file");
        }
    }
    public void addStuff(String input){

        this.tasks.add(input);
        try{
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/taskstodo.txt");
            Files.write(myPath, this.tasks);
        } catch(IOException ex){
            System.out.println("Unable to write file: list");
        }
    }
    public int check(){

        return this.tasks.size();
    }

    public void remove(int t){

        this.tasks.remove(tasks.get(t));
        try{
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/taskstodo.txt");
            Files.write(myPath, this.tasks);
        }catch(IOException ex){
            System.out.println("Unable to write file: list");
        }
    }

    public void removeElement(int t){

        this.tasks.remove(tasks.get(t-1));
        try{
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/taskstodo.txt");
            Files.write(myPath, this.tasks);
        }catch(IOException ex){
            System.out.println("Unable to write file: list");
        }
    }



/*
    public void addTask(TaskDone task){
        tasks.add(task);
    }
    @Override
    public String toString(){

        String result = "";
        for (int i = 0; i < tasks.size(); i++) {
            result += (i + 1) + ". " + tasks.get( i ) + "\n";
        }
        return result;
    }*/
}
