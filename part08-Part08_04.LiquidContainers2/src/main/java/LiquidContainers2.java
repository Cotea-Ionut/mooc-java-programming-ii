
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int ammount = Integer.valueOf(parts[1]);

            if(ammount < 0){
                continue;
            }

            if(command.equals("add")){
                first.add(ammount);
            }

            if(command.equals("move")){
                if (ammount > first.contains()){
                    ammount = first.contains();
                }

                first.remove(ammount);;
                second.add(ammount);;

                if(second.contains() > 100){
                    second.add(100);
                }
            }

            if(command.equals("remove")){
                second.remove(ammount);;
                if(second.contains() < 0){
                    second.remove(100);;
                }
            }

        }
    }

}
