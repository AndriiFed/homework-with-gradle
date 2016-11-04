package jelementary;

import java.util.Arrays;

public class School {
  private String name;
  private Group[] groups;

  public School() {
    this.name = "Unnamed school";
  }

  public School(String name) {
    this.name = name;
  }

  public School(String name, Group[] groups) {
    this(name);
    this.groups = groups;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addGroup(Group newGroup) {
    newGroup.setSchool(this);
    if (groups == null) {
      groups = new Group[] {newGroup};
      return;
    }
    groups = Arrays.copyOf(groups, groups.length + 1);
    groups[groups.length - 1] = newGroup;
  }

  public String toString() {
    String result = "School: " + name;
    return result;
  }

}
