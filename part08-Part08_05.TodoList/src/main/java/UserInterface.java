import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private TodoList todoList;

  public UserInterface(TodoList todoList, Scanner scanner){
    this.scanner = scanner;
    this.todoList = todoList;
  }

  public void start(){
    while (true) {
      System.out.println("Command: ");
      String command = scanner.nextLine();

      if (command.equals("stop")){
        break;
      }

      if (command.equals("add")){
        System.out.println("To add: ");
        String toAdd = scanner.nextLine();
        todoList.add(toAdd);
      }

      if (command.equals("list")){
        todoList.print();
      }

      if (command.equals("remove")){
        System.out.println("Which one is removed? ");
        int removedIndex = Integer.valueOf(scanner.nextLine());
        todoList.remove(removedIndex);
      }
    }
  }
}
