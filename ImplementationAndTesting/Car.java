public class Car implements Describable {

  private String description;
  private String manufacturer;

  public Car(String manufacturer) {
    this.description = description;
    this.manufacturer = manufacturer;
  }

  public String getDescription() {
    description = "My car is a " + this.manufacturer;
    return description;
  }

  public void setDescription(String newDescription) {
     this.description = newDescription;
  }

}