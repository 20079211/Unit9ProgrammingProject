import java.util.*;
import java.text.*;

class Main {
  public static void main(String[] args) {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    ArrayList<Product> products = new ArrayList<Product>();
    int[] randomNumbers = new int[6];
    for(int i = 0; i<randomNumbers.length; i++) {
      randomNumbers[i] = (int) (Math.random()*4)+3;
    }
    products.add(new Women("Jersey", "Nike", 19.99, true));
    products.add(new Men("Dress-Pants", "H&M", 39.99, 40, 'M'));
    products.add(new Clothing("Unisex Top", "Target", 14.99, "Nike", 'L'));
    products.add(new Media("Animal Farm", "Orwell", 14.99, "Hard-cover"));
    products.add(new Electronics("Macbook Air", "Apple", 349.99, true, 100));
    products.add(new Product());
    
    int count = 0;
    for(Product p: products) {
      p.setQuantity(randomNumbers[count]);
      count++;
    }
    System.out.println("Name\t\tCompany\tQuantity\tPrice\t\tMisc.");
    for(int i = 0; i<75; i++) {
        System.out.print("*");
      }
    System.out.println();
    for(Product p: products) {
      System.out.println(p);
      System.out.printf("Total for " + p.getQuantity() + " " + p.getName() + " is: %s", nf.format(productCost(p)));
      System.out.println();
      for(int i = 0; i<75; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.printf("Grand total is: %s", nf.format(grandCost(products)));
  }

  public static double productCost(Product p) {
    double total = 0;
    total = (p.getQuantity() * p.getPrice());
    return total;
  }
  public static double grandCost(ArrayList<Product> p) {
    double grandtotal = 0;
    for(Product product: p) {
      grandtotal += productCost(product);
    }
    return grandtotal;
  }
}