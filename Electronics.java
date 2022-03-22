public class Electronics extends Product {
  private double charge;
  private boolean batteryIncluded;

  public Electronics(String n, String c, double p, boolean bI, double cha) {
    super(n, c, p);
    batteryIncluded = bI;
    charge = cha;
  }

  public Electronics(boolean bI, double ch) {
    batteryIncluded = bI;
    if(batteryIncluded && (charge >= 0 && charge <= 100)) {
      charge = ch;
    }
    else if (batteryIncluded) {
      charge = 100.00;
    }
    else {
      charge = 0.00;
    }
  }

  public Electronics() {
    batteryIncluded = false;
    charge = 0.00;
  }

  public boolean getBattInc() {
    return batteryIncluded;
  }

  public double getCharge() {
    return charge;
  }

  public void setBattInc(boolean b) {
    batteryIncluded = b;
  }

  public void setCharge(double d) {
    charge = d;
  }
  public String toString() {
    String results = super.toString();
    if(batteryIncluded) {
      results += "\tCharge: " + charge + "%";
    }
    return results;
  }
}