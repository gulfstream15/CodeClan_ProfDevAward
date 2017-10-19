public class RunnerPoly {
  
  public static void main(String[] args) {
     new RunnerPoly();
  }
    
  public RunnerPoly() {
    Car car = new Car ("Maserati");
    Garage garage = new Garage(10, 20, 40);

    System.out.println(description(car));
    System.out.println(description(garage));
  }
 
  private String description (Describable describable) {
    return describable.getDescription();
  }

}