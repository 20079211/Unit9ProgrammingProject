public class Media extends Product {
  private String type;
  public Media() {
    type = "unknown";
  }

  public Media(String n, String c, double p, String t) {
    super(n, c, p);
    type = t;
  }

  public Media(String t) {
    type = t;
  }

  public String getType() {
    return type;
  }

  public void setType(String s) {
    type = s;
  }

  public String toString() {
    String results = super.toString() + "\tType: " + type;
    return results;
  }
}