package jelementary;

import jelementary.people.Student;

public class Group {
  private String name;
  private Student[] students;

  public Group() {
  }

  public Group(String name) {
    this.name = name;
    students = new Student[0];
  }

  public String getName() {
    return name;
  }

  public Student[] getStudents() {
    return students;
  }

  public void addStudent(Student student) {
    Student[] temp = new Student[students.length + 1];

    System.arraycopy(students, 0, temp, 0, students.length);
    temp[students.length] = student;

    students = temp;
  }

  public String toString() {
    String listOfStudents = "";
    for (Student student : students) {
      listOfStudents += "\n" + student.getName();
    }
    return "Group: " + name + ".\n" + "List of students: " + listOfStudents;
  }
}