import java.util.ArrayList;

public class ChangeHistory {
  private ArrayList<Double> history;

  public ChangeHistory(){
    this.history = new ArrayList<>();
  }

  public void add(double status) {
    history.add(status);
  }

  public void clear(){
    this.history = new ArrayList<>();
  }

  public String toString(){
    return this.history.toString();
  }

  public double maxValue(){
    if(history.isEmpty()){
      return 0;
    }
    double comparison = history.get(0);
    for(Double item : history){
      if(item > comparison){
        comparison = item;
      }
    }
    return comparison;
  }

  public double minValue(){
    if(history.isEmpty()){
      return 0;
    }
    double comparison = history.get(0);
    for(Double item : history){
      if(item < comparison){
        comparison = item;
      }
    }
    return comparison;
  }

  public double average(){
    if(history.isEmpty()){
      return 0;
    }
    double sum = 0;
    int count = 0;
    for(Double item : history){
      sum += item;
      count++;
    }
    return sum / count;
  }
}
