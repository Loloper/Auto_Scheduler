import java.util.Scanner;
public class Application {

    public static void main(String[] args){
        Application app = new Application();
        app.menu();
    }

    public static void createTask(){
        System.out.println("I have been sent here for some reason");
    }
    public static void menu(){
        System.out.println("Select an option: N = new task");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine().toUpperCase();
        switch(option){
            case "N":
                createTask();
                break;
            default:
                break;
        }
    }
}
