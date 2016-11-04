package jelementary.people;

public class Student {
  private String name;
  private double rating;

  public Student() {

  }

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setRating(double rating) {
    this.rating = rating;
  } 

  public double getRating() {
    return rating;
  }

  public String toString() {
    return "Student - " + name;
  }
}