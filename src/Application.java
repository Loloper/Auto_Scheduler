import java.util.ArrayList;
import java.util.Scanner;
public class Application {

    public static void main(String[] args){
        Application app = new Application();
        ArrayList<Task> tasks = new ArrayList<>();
        ArrayList<Task> completedTasks = new ArrayList<>();
        app.menu(tasks, completedTasks);
    }

    public void checkTaskOff(ArrayList<Task> task, ArrayList<Task> completedTask){
        System.out.println("Index of task: ");
        Scanner index = new Scanner(System.in);
        int taskIndex = index.nextInt();
        Task movedtask = task.get(taskIndex);
        completedTask.add(movedtask);
        task.remove(taskIndex);
    }

    public void getTasks(ArrayList<Task> task){
        for(int i=0; i<task.size(); i++){
            System.out.println(" " + i + ". " + task.get(i));
        }
    }

    public void createTask(ArrayList<Task> task){
        String taskName;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Task Name and priority(1-3): ");
            taskName = scan.nextLine();
            int priority = scan.nextInt();
            task.add(new Task(taskName, priority, false));
        }while(!taskName.equals("exit"));
        task.removeLast();
    }
    public void menu(ArrayList<Task> tasks, ArrayList<Task> completedTasks){
        System.out.println("Select an option: N = new task, M = see tasks, C = Check task off");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine().toUpperCase();
        switch(option){
            case "N":
                createTask(tasks);
                System.out.println(tasks.toString());
                menu(tasks, completedTasks);
                break;
            case "M":
                getTasks(tasks);
                menu(tasks, completedTasks);
                break;
            case "C":
                checkTaskOff(tasks, completedTasks);
                System.out.println(completedTasks.toString());
                menu(tasks, completedTasks);
            default:
                break;
        }
    }
}
