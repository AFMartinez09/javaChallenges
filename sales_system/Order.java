package sales_system;

public class Order {
  private final int idOrder;
  private Products[] products;
  private int countProducts;
  private static final int MAX_PRODUCTS = 10;
  private static int countOrders;

  public Order(){
    this.idOrder = ++Order.countOrders;
    this.products = new Products[Order.MAX_PRODUCTS];
  }

  public void addProduct(Products products){
    if(this.countProducts < Order.MAX_PRODUCTS){
      // [allow us to know how many products are inside]
      this.products[this.countProducts++] = products;
    } else
    System.out.println("In this order you can only have " + Order.MAX_PRODUCTS);
  }

  public double calculateTotal(){
    double total = 0;
    for (int i = 0; i < this.countProducts; i++) {
      var product = this.products[i];
      total += product.getPrice();
    }
    return total;
  }

  public void showOrder(){
    System.out.println("Id Order: " + this.idOrder);
    var totalOrder = this.calculateTotal();
    System.out.println( "\t Total Order: $" + totalOrder );
    System.out.println("\tOrder Products: ");
    
    //Only show products were adding it 
    for (int i = 0; i < this.countProducts; i++) {
      // println use toString (Products.java) and show data
      System.out.println("\t\t" + this.products[i]); 
    }
  }
}
