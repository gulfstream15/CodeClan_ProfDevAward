import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class MusicPlayerTest{
  MusicPlayer musicplayer;
  Vinyl vinyl;
  CompactDisk compactdisk;

  @Before 
  public void before() {
    musicplayer = new MusicPlayer("Mike's Multi Player");
    vinyl = new Vinyl(); 
    compactdisk = new CompactDisk();
  }

  @Test
  public void hasName(){
    assertEquals("Mike's Multi Player", musicplayer.getName());
  }

  @Test
  public void collectionStartsEmpty(){
    assertEquals(0, musicplayer.collectionCount());
  }

  @Test
  public void canPlayVinyl(){
    musicplayer.play(vinyl);
    assertEquals(1, musicplayer.collectionCount());
  }

  @Test
  public void canPlayCD(){
    musicplayer.play(compactdisk);
    assertEquals(1, musicplayer.collectionCount());
  }

  @Test
  public void shouldHaveNoCollectionAfterEmptying(){
    musicplayer.play(vinyl);
    musicplayer.play(compactdisk);
    musicplayer.empty();
    assertEquals(0, musicplayer.collectionCount());
  }

  @Test 
  public void canRemoveOneVinyl() {
    musicplayer.play(vinyl);
    Playable format = musicplayer.removeOne();
    assertEquals("I'm a vinyl record", format.formatType());
  }

  @Test 
  public void canRemoveOneCD() {
    musicplayer.play(compactdisk);
     Playable format = musicplayer.removeOne();;
     assertEquals("I'm a compact disk", format.formatType());
  }

  @Test
  public void getCDValue() {
    assertEquals(5_000, compactdisk.collectionValue());
  } 

  @Test
  public void getVinylValue() {
    assertEquals(10_000, vinyl.collectionValue());
  } 


  @Test 
  public void getTotalCollectionValue() {
    musicplayer.play(vinyl);
    musicplayer.play(compactdisk);
    int total = musicplayer.totalCollectionValue();
    assertEquals(15_000, total);
  }
 
}
