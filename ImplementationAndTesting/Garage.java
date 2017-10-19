public class Garage implements Describable {

  private String description;
  private int height;
  private int width;
  private int length;
  
  public Garage(int height, int width, int length) {
    this.height = height;
    this.width = width;
    this.length = length;
  }

  public String getDescription() {
    description = "My garage is " + this.height + "ft high, " + this.width + "ft wide and " + this.length + "ft long";
    return description;
  }

  public void setDescription(String newDescription) {
     this.description = newDescription;
  }

}

