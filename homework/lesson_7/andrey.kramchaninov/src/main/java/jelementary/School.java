package jelementary;

public class School {

  public String name;
  public int groupsLimit;
  public int currentGroupsAmount;
  public Group[] groups;

  public School() {

  }

  public School(String name, int groupsLimit) {
    this.name = name;
    groups = new Group[groupsLimit];
    currentGroupsAmount = 0;
  }

  public void addGroups(Group group) {
    groups[currentGroupsAmount] = group;
    currentGroupsAmount++;
  }

  public void addGroups(Group ...group) {
    for (int i = 0; i < group.length; i++) {
      addGroups(group[i]);
    }
  }

}
