import java.util.*;

public class MusicPlayer{
  
  private String name;
  private ArrayList<Playable> collection;
  private int runningTotal;

  public MusicPlayer(String name){
    this.collection = new ArrayList<Playable>();
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public int collectionCount(){
    return this.collection.size();
  }

  public void play(Playable format){
    this.collection.add(format);
  }

  public void empty(){
    this.collection.clear();
  }

  public Playable removeOne() {
    if (collectionCount() > 0) {
      return collection.remove(0);
    }
    return null;
  }

  public int totalCollectionValue() {
    runningTotal = 0;
    for(Playable playable: this.collection) {
      runningTotal += playable.collectionValue();
    }
    return runningTotal;
  }

}
