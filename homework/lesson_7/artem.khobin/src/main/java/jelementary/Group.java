package jelementary;

import jelementary.people.Student;

import java.util.Arrays;

public class Group {
  private String name;
  private School school;
  private Student[] students;

  public Group() {
    this.name = "Unnamed group";
  }

  public Group(String name, School school) {
    this.name = name;
    this.school = school;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSchool(School school) {
    this.school = school;
  }

  public void addStudent(Student newStudent) {
    newStudent.addGroup(this);
    if (students == null) {
      students = new Student[] {newStudent};
      return;
    }
    students = Arrays.copyOf(students, students.length + 1);
    students[students.length - 1] = newStudent;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    String result = "Group: " + name;
    result += "; " + school;
    return result;
  }
}
