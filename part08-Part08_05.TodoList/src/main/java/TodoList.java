import java.util.ArrayList;

public class TodoList {

  private ArrayList<String> list = new ArrayList<>();

  public void add(String task){
    list.add(task);
  }

  public void print(){
    for(String task: list){
      int index = list.indexOf(task) + 1;
      System.out.println(index + ": " + task);
    }
  }

  public void remove(int number){
    int index = number - 1;
    list.remove(index);
  }

}
