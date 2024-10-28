package files_machine_machine.service;
import java.util.List;
import files_machine_machine.model.Snack;

public interface IServiceSnacks {
  void addSnack(Snack snack);
  void showSnacks();
  List<Snack> getSnacks();
}