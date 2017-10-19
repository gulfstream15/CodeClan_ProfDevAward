public class Bike {

  private int wheelRPM;
  private int degreeOfTurn;
  private int gearRatio = 20;

  public void calcWheelRPM(int pedalRPM) {
    this.wheelRPM = pedalRPM * gearRatio;
  }

  public void setDegreeOfTurn(int degreeOfTurn) {
    this.degreeOfTurn = degreeOfTurn;
  }

  public int getWheelRPM() {
    return this.wheelRPM;
  }

  public int getDegreeOfTurn() {
    return this.degreeOfTurn;
  }

}