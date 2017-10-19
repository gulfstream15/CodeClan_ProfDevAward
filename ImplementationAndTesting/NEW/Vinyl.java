public class Vinyl implements Playable {

  private int vinylCost;

  public String formatType() {
     return "I'm a vinyl record";
  }
  
  public int collectionValue() {
    vinylCost = 10_000;
    return vinylCost;
  }

}