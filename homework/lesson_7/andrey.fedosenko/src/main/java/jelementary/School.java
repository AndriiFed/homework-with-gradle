package jelementary;

import  jelementary.Group;
import  jelementary.people.Student;

public class School {
  String name;
  String address;
  Group[] groups;

  public School() {
  }

  public School(String name, String address) {
    this.name = name;
    this.address = address;
    groups = new Group[0];
  }

  public String toString() {
    String buffer =  "SCHOOL: " + name + ", Address: " + address + ", Groups: ";
    if (groups.length == 0) {
      return buffer + "no groups";
    }
    for (int i = 0; i < groups.length; i++) {
      buffer += "\n\t " + groups[i].toString();
    }
    return buffer;
  }

  public void addGroup(Group newgroup) {
    Group[] tmp = new Group[groups.length + 1];
    for (int i = 0; i < groups.length; i++) {
      tmp[i] = groups[i];
    }
    tmp[groups.length] = newgroup;
    groups = tmp;
  }
}
