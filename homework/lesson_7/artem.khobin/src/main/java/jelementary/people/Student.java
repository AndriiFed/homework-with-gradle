package jelementary.people;

import jelementary.Group;

import java.util.Arrays;

public class Student {
  private String name;
  private Group[] groups;

  public Student() {
    this.name = "Unnamed student";
  }

  public Student(String name) {
    this.name = name;
  }

  public void addGroup(Group newGroup) {
    if (groups == null) {
      groups = new Group[] {newGroup};
      return;
    }
    groups = Arrays.copyOf(groups, groups.length + 1);
    groups[groups.length - 1] = newGroup;
  }

  public String getName() {
    return name;
  }

  public Group[] getGroups() {
    return groups;
  }

  public String toString() {
    String result = "Name: " + name;
    if (groups != null) {
      result += "; Groups: ";
      for (int i = 0; i < groups.length; i++) {
        result += groups[i].getName() + " ";
      }
    }
    return result;
  }

}
