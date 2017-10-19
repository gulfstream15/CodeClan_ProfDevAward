public class RunnerInherit {
  
  public static void main(String[] args) {
    System.out.println("Starting...");
    System.out.println("Creating a bicycle...");

    Bike bike = new Bike();

    bike.setDegreeOfTurn(0);
    bike.calcWheelRPM(30);

    System.out.println("Turning:" + bike.getDegreeOfTurn());
    System.out.println("Wheel RPM:" + bike.getWheelRPM());

    System.out.println("Creating a mountain bike..." );
    MountainBike mountainbike = new MountainBike();

    mountainbike.setDegreeOfTurn(10);
    mountainbike.setGearRatio(3);
    mountainbike.calcWheelRPM(60);

    System.out.println("Turning:" + mountainbike.getDegreeOfTurn());
    System.out.println("Wheel RPM:" + mountainbike.getWheelRPM());

  }

}