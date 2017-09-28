import java.util.ArrayList;

public class TaskDone {

    private String name;
    private boolean completed;

    public TaskDone(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}



