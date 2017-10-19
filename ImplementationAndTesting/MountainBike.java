public class MountainBike extends Bike {

  private int gearRatio = 40;
  private int wheelRPM;

  public int setGearRatio(int gearRatio) {
    return this.gearRatio = gearRatio;
  }

  public void calcWheelRPM(int pedalRPM) {
    this.wheelRPM = pedalRPM * gearRatio;
  }

  public int getWheelRPM() {
    return this.wheelRPM;
  }

}