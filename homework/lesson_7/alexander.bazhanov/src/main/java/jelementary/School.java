package jelementary;

import jelementary.Group;

import jelementary.people.Student;

public class School {
  private String schoolName;
  private Group[] groups = new Group[8];
  private int amountOfGroups = 0;

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public void addGroup(Group group) {
    if (group == null) {
      System.out.println("There is no such group!");
    } else if (amountOfGroups < 8) {
      groups[amountOfGroups] = group;
      amountOfGroups++;
    } else {
      System.out.println("There is no free classroom for new group, sorry!");
    }
  }

  public String getSchoolFullInfo() {
    return "School name - " + schoolName + "\n"
          + "Current amount of groups - " + amountOfGroups + "\n"
          + getGroupsWithStudents() + "\n";
  }

  public String getGroupsWithStudents() {
    String result = "";
    for (int i = 0; groups[i] != null && i < groups.length; i++) {
      result += groups[i].getGroupName() + "\n" + groups[i].getAllStudents() + "\n";
    }
    return result;
  }
}
