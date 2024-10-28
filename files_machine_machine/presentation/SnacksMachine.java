package files_machine_machine.presentation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import files_machine_machine.model.Snack;
import files_machine_machine.service.FilesServiceSnacks;
import files_machine_machine.service.IServiceSnacks;

public class SnacksMachine {
  public static void main(String[] args){
    snackMachine();
  }
  public static void snackMachine(){
    var out = false;
    var console = new Scanner(System.in);

    IServiceSnacks snackService = new FilesServiceSnacks();

    List<Snack> products = new ArrayList<>();
    System.out.println("*** Snacks machine ***");
    // Show stock (available snacks)
    snackService.showSnacks();

    while(!out){
      try {
        var option = showMenu(console);
        out = executeOptions(option, console, products, snackService);
      } catch (Exception e) {
        System.out.println("Opps. Something happened. " + e.getMessage());
      }
      finally{
        // printline for each interaction
        System.out.println();
      }
    }
  }

  private static int showMenu(Scanner console){
    System.out.print("""
        Menu:
        1. Buy Snack
        2. Show Ticket
        3. Add New Snack
        4. Out
        Choose an option:\s""");
      // read and return user option
      return Integer.parseInt(console.nextLine());
  }

  private static boolean executeOptions(int option, 
                                        Scanner console, 
                                        List<Snack> products,
                                        IServiceSnacks snackService){
    var out = false;
    switch (option) {
      // products accedemos a los elementos de la lista (products)
      case 1 -> buySnack(console, products, snackService);
      case 2 -> showTicket(products);
      case 3 -> addSnack(console, snackService);
      case 4 -> {
        System.out.println("Have a good day!");
        out = true;
      }
      default -> System.out.println("Invalid option " + option);
    }
    return out;
  }

  private static void buySnack(Scanner console, List <Snack> products, IServiceSnacks snackService){
    System.out.print("Please choose one option from the list (id): ");
    var idSnack = Integer.parseInt(console.nextLine());

    // checking snack (available)
    var snackFound = false;
    for(var snack: snackService.getSnacks()){
      if(idSnack == snack.getIdSnack()){
        // adding snack list snacks
        products.add(snack);
        System.out.println("Ok Snack added: " + snack);
        snackFound = true;
        break;
      }
    }
    if(!snackFound){
      System.out.println("Sorry. Id snack not found " + idSnack);
    }
  }
  
  private static void showTicket(List<Snack> products){
    var ticket = "*** Ticket ***";
    var total = 0.0;
    for(var product: products){
      ticket += "\n\t-" + product.getName() + " - $" + product.getPrice();
      total += product.getPrice();
    }
    ticket += "\n\tTotal: $" + total;
    System.out.println(ticket);
  }

  private static void addSnack(Scanner console, IServiceSnacks serviceSnacks){
    System.out.print("Snack name: ");
    var name = console.nextLine();
    System.out.print("Snack price: ");
    var price = Double.parseDouble(console.nextLine());
    // sending new object having new data
    serviceSnacks.addSnack(new Snack(name, price));
    System.out.println("New snack has been added succesfully.");
    serviceSnacks.showSnacks();
  }
}