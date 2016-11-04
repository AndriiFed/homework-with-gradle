package jelementary;

import jelementary.people.Student;

public class Group {
  private Student[] students  = new Student[12];
  private String groupName;
  private int studentsAmount = 0;

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public String getGroupName() {
    return groupName;
  }

  public int getStudentsAmount() {
    return studentsAmount;
  }

  public void addStudent(Student student) {
    if (student == null) {
      System.out.println("No such student!");
    } else if (studentsAmount < 12) {
      students[studentsAmount] = student;
      studentsAmount++;
    } else {
      System.out.println("Too much students in this Group, pls try another");
    }
  }

  public String getAllStudents() {
    String result = "";
    for (int i = 0; students[i] != null && i < students.length; i++) {
      result += students[i].getName() + ", ";
    }
    return result;
  }
}
