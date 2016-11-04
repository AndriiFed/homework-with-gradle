package jelementary;

import  jelementary.people.Student;

public class Group {
  String name;
  int number;
  Student[] students;

  public Group() {
  }

  public Group(String name, int number) {
    this.name = name;
    this.number = number;
    students = new Student[0];
  }

  public String toString() {
    String buffer =  "GROUP: " + name + ", No. " + number + ", Students: ";
    if (students.length == 0) {
      return buffer + " no students.";
    }
    for (int i = 0; i < students.length; i++) {
      buffer += "\n\t\t-> " + students[i].toString();
    }
    return buffer;
  }

  public void addStudent(Student newstudent) {
    Student[] tmp = new Student[students.length + 1];
    for (int i = 0; i < students.length; i++) {
      tmp[i] = students[i];
    }
    tmp[students.length] = newstudent;
    students = tmp;
  }

}
