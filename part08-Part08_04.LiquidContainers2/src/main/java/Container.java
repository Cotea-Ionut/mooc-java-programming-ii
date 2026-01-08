public class Container {
  private int liter;

  public int contains(){
    return liter;
  }

  public void add(int ammount){
    if (ammount < 0){
      return;
    }
    liter += ammount;{
      if (liter > 100){
        liter = 100;
      }
    }
  }

  public void remove(int ammount){
    if(ammount < 0){
      return;
    }

    liter -= ammount;
    if(liter < 0){
      liter = 0;
    }
  }
  
  public String toString(){
    return liter + "/100";
  }
}
