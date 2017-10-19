public class CompactDisk implements Playable {

  private int diskCost;

  public String formatType() {
     return "I'm a compact disk";
  }
  
  public int collectionValue() {
    diskCost = 5_000;
    return diskCost;
  }

}