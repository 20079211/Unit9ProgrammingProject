public class Clothing extends Product {
  private String brand;
  private char size;
  
  public Clothing(String n, String c, double p, String br, char si) {
    super(n,c,p);
    brand = br;
    size = si;
  }

  public Clothing() {
    brand = "Name-Brand";
    size = 'M';
  }

  public String getBrand() {
    return brand;
  }

  public char getSize() {
    return size;
  }

  public void setBrand(String s) {
    brand = s;
  }

  public void setSize(char s) {
    size = s;
  }

  public String toString() {
    String results = super.toString() + "\tBrand: " + brand + "\tSize: " + size;
    return results;
  }

  // copy of parent toString method so it can be inherited to grandchildren (although there's probably a better way to do this with class encapsulation)
  public String print() {
    String results = super.toString();
    return results;
  }
}