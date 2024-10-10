package sales_system;
public class Products {
  // final para que no pueda modificarse
  private final int idProduct;
  private String name;
  private double price;
  // create unique idProducts in numbers
  private static int countProducts;

  public Products(String name, double price){
    // start in 0 when create an object increment it and use as an id
    this.idProduct = ++Products.countProducts;
    this.name = name;
    this.price = price;
  }

  public int getIdProduct() {
    return this.idProduct;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
      "idProducto = " + this.idProduct +
      ", nombre = '" + this.name + '\'' +
      ", precio = $" + this.price +
      '}';
  }
}
