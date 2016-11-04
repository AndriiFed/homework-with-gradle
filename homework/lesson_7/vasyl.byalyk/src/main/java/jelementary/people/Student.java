package jelementary.people;

public class Student {
  public String name;
  int age;
  double  pointaverage;

  public Student() {
  }

  public Student(String newName, int newAge, double newpointaverage ) {
    name = newName;
    age = newAge;
    pointaverage = newpointaverage;
  }

  public String toString() {
    String str = "Student info: name - " + name + "; years old - " + age + "; ";
    str += "point average - " + pointaverage + ";";
    return str;
  }
}
