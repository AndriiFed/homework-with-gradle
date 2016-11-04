package jelementary;


public class School {
  private String name;
  private String address;
  private Group[] groups;

  public School() {
  }

  public School(String name, String address) {
    this.name = name;
    this.address = address;
    groups = new Group[0];
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public Group[] getGroups() {
    return groups;
  }

  public void addGroup(Group group) {
    Group[] temp = new Group[groups.length + 1];

    System.arraycopy(groups, 0, temp, 0, groups.length);
    temp[groups.length] = group;

    groups = temp;
  }

  public String toString() {
    String listOfGroups = "";
    for (Group group : groups) {
      listOfGroups += "\n" + group.getName();
    }
    return name + " school. Address: " + address + ".\n" + "List of groups: " + listOfGroups;
  }
}