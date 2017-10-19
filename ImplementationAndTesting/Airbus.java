public class Airbus extends Plane {

  private int speed = 40;
  private int wingspan;

  public Airbus (int speed, int wingspan) {
    this.speed = speed;
    this.wingspan = wingspan;
  }

  private int setSpeed(int newspeed) {
    return this.speed = newspeed;
  }

  private int getSpeed() {
    return this.speed;
  }

  private int setWingspan(int newWingspan) {
    return this.wingspan = newWingspan;
  }

  private int getWingspan() {
    return this.wingspan;
  }

}