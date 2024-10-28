package files_machine_machine.service;
import java.util.ArrayList;
import java.util.List;

import files_machine_machine.model.Snack;

public class ServiceSnacksList implements IServiceSnacks{
  private static final List<Snack> snacks;
  
  // Bloque static inicializador
  static{
    // We could change the content array not the reference (snacks)
    snacks = new ArrayList<>();
    // new Snack create an object(Snack)
    snacks.add(new Snack("Soda", 10));
  }

  public void addSnack(Snack snack){
    snacks.add(snack);
  }

  public void showSnacks(){
    var stockSnacks = "";
    // concat each snack
    for(var snack: snacks){
      stockSnacks += snack.toString() + "\n";
    }
    System.out.println("***Snacks Stock***");
    System.out.println(stockSnacks);
  }

  public List<Snack> getSnacks(){
    return snacks;
  }
}
