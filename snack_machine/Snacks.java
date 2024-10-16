package snack_machine;
import java.util.ArrayList;
import java.util.List;

public class Snacks {
  private static final List<Snack> snacks;
  
  // Bloque static inicializador
  static{
    // We could change the content array not the reference (snacks)
    snacks = new ArrayList<>();
    // new Snack create an object(Snack)
    snacks.add(new Snack("Soda", 10));
  }

  public static void addSnack(Snack snack){
    snacks.add(snack);
  }

  public static void showSnacks(){
    var stockSnacks = "";
    // concat each snack
    for(var snack: snacks){
      stockSnacks += snack.toString() + "\n";
    }
    System.out.println("***Snacks Stock***");
    System.out.println(stockSnacks);
  }

  public static List<Snack> geSnacks(){
    return snacks;
  }
}
