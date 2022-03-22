import java.util.*;

public class Product {
  private double price;
  private int quantity;
  private String company, name;
  // constructor for every attribute of 'Product', although it is never explicitly used since it specifies quantity
  public Product(String n, String c, double p, int q) {
    this(n,c,p);
    quantity = q;
  }
  
  // constructor with default quantity of 1 
  public Product(String n, String c, double p) {
    price = p;
    company = c;
    name = n;
    quantity = 1; // default quantity since we're randomly assigning them anyway and it was getting repetitive assigning arbritary numbers just to change them
  }
  
  // default constructor
  public Product() {
    this("Notebook", "Staples", 5.99);
  }

  // accessor methods
  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getCompany() {
    return company;
  }

  // mutator methods
  public void setPrice(double d) {
    price = d;
  }

  public void setQuantity(int x) {
    quantity = x;
  }

  public void setName(String n) {
    name = n;
  }

  public void setCompany(String c) {
    company = c;
  }

  // toString method that all subclasses build from
  public String toString() {
    String results = "";
    results += (name + "\t" + company + "\t\t\t" + quantity + "\t$" + price + "\t");
    return results;
  }
}