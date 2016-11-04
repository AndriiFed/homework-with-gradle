package jelementary.people;

public class Student {
  String name;
  int age;
  int rating;

  public Student() {
  }

  public Student(String name, int age, int rating) {
    this.name = name;
    this.age = age;
    this.rating = rating;
  }

  public String toString() {
    return name + ", " + age + " years old," + " rating: " + rating;
  }
}
