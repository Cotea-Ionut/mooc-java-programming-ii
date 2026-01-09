import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
  HashMap<String, ArrayList<String>> facilities;

  public StorageFacility(){
    this.facilities = new HashMap<>();
  }

  public void add(String unit, String item){
    this.facilities.putIfAbsent(unit, new ArrayList<>());
    this.facilities.get(unit).add(item);
  }

  public ArrayList<String> contents(String storageUnit){
    if(facilities.containsKey(storageUnit)){
      return facilities.get(storageUnit);
    }
    return new ArrayList<>();
  }

  public void remove(String storageUnit, String item){
    if(!this.facilities.containsKey(storageUnit)){
      return;
    }
    this.facilities.get(storageUnit).remove(item);
    if(this.facilities.get(storageUnit).isEmpty()){
      facilities.remove(storageUnit);
    }
    
  }

  public ArrayList<String> storageUnits(){
    ArrayList<String> names = new ArrayList<>();
    for (String storageUnit : facilities.keySet()){
      names.add(storageUnit);
    } 
    return names;
  }

}
