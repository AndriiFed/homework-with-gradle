package jelementary;

import jelementary.people.Student;

public class Group {

  public String name;
  public String teacher;
  public int studentsLimit;
  public int currentStudentAmount;
  public Student[] students;

  public Group() {

  }

  public Group(String name, String teacher, int studentsLimit) {
    this.name = name;
    this.teacher = teacher;
    students = new Student[studentsLimit];
    currentStudentAmount = 0;
  }

  public void addStudents(Student student) {
    students[currentStudentAmount] = student;
    currentStudentAmount++;
  }

  public void addStudents(Student ...student) {
    for (int i = 0; i < student.length; i++) {
      addStudents(student[i]);
    }
  }

}
