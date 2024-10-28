package files_machine_machine.service;
import files_machine_machine.model.Snack;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FilesServiceSnacks implements IServiceSnacks {
  private final String FILE_NAME = "snacks.txt";
  // Create snacks list
  private List<Snack> snacks = new ArrayList<>();

  public FilesServiceSnacks(){
    var file = new File(FILE_NAME);
    var existsFile = false;
    try {
      existsFile = file.exists();
      if(existsFile){
        // this.snacks = gettingSnacks();
      }else{
        var out = new PrintWriter(new FileWriter(file));
        out.close();
        System.out.println("Se ha creado el archivo"); 
      }
    } catch (Exception e) {
        System.out.println("error al crear el archivo: " + e.getMessage());
    }
    // if don't exists, upload initial snacks (List snacks)
    if(!existsFile){
      uploadInitialSnacks();
    } 
  }

  private void uploadInitialSnacks(){
    this.addSnack(new Snack("soda", 20));
    this.addSnack(new Snack("chips", 20.4));
    this.addSnack(new Snack("gummy bears", 10));
    this.addSnack(new Snack("cookies", 2));
  }

  @Override
  public void addSnack(Snack snack) {
    // adding new snack
    this.snacks.add(snack);

    // saving new snack in file
    this.addSnackFile(snack);
  }

  private void addSnackFile(Snack snack){
    boolean attach = false;
    var file = new File(FILE_NAME);
    try {
      // this line add snack preventing overwritten if exists data 
      attach = file.exists();
      var out = new PrintWriter(new FileWriter(file, attach));
      out.println(snack.writeSnack());
      out.close();
      System.out.println("Snack has been added succesufully");
      
    } catch (Exception e) {
        System.out.println("Error adding snack: " +e.getMessage());
    }
  }

  @Override
  public List<Snack> getSnacks() {
    return null;
  }

  @Override
  public void showSnacks() {
    
  }
  
}
