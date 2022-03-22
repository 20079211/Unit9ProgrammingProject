public class Men extends Clothing {
  private int inseam;
  
  public Men(String n, String b, double p, int i) {
    super(n, "Men\'s", p, b, 'M');
    inseam = i;
  }
  
  public Men(String n, String b, double p, int i, char s) {
    this(n, b, p, i);
    this.setSize(s);
  }
  
  public int getInseam() {
    return inseam;
  }

  public void setInseam(int i) {
    inseam = i;
  }
  
  public String toString() {
    String results = super.toString();
    results += "\t" + "Inseam Length: " + inseam;
    return results;
  }
}