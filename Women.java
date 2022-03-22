public class Women extends Clothing {
  private boolean isCropped; 
  // I spent maybe thirty minutes - way too long - trying to find a variable to describe womens clothing
  // I settled on 'isCropped' for if a top is a crop-top 

  public Women(String n, String b, double p, boolean i) {
    super(n, "\tWomen\'s", p, b, 'M');
    isCropped = i;
  }

  public Women(String n, String b, double p, boolean i, char s) {
    this(n, b, p, i);
    this.setSize(s);
  }
  
  public boolean getCropped() {
    return isCropped;
  }
  
  public String toString() {
    String results = super.toString();
    results += "\tCropped? ";
    if(isCropped) {
      results += "Yes";
    }
    else {
      results += "No";
    }
    return results;
  }
}