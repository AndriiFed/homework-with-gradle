package jelementary;

import  jelementary.people.Student;


public class Group {
  String name;
  Student[] students;

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
    Student[] tmp = new Student[students.length + 1];
    System.arraycopy(students, 0, tmp, 0, students.length);
    tmp[students.length] = student;
    students = tmp;
  }

  public String toString() {
    String listOfStudents = " ";
    for (Student student : students) {
      listOfStudents += "\n" + student.getName();
    }
    return "Group: " + name + ".\n" + "List of students: " + listOfStudents;
  }
}
