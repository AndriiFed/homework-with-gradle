package jelementary;

import  jelementary.Group;
import  jelementary.people.Student;

public class School {
  String name;
  String adress;
  Group[] groups;
  
  public School() {
   
  }
  
  public School(String name, String adress) {
    this.name = name;
    this.adress = adress;
    groups = new Group[0];
  }

  public String getName() {
    return name;
  }

  public String getAdress() {
    return adress;
  }

  public Group[] getGroups() {
    return groups;
  }

  public void addGroup(Group group) {
    Group[] tmp = new Group[groups.length + 1];
    System.arraycopy(groups, 0, tmp, 0, groups.length);
    tmp[groups.length] = group;
    groups = tmp;
  }

  public String toString() {
    String listOfGroups = " ";
    for (Group group : groups) {
      listOfGroups += "\n" + group.getName();
    }
    return name + "School adress: " + adress + ".\n" + "List of groups: " + listOfGroups;
  } 
}
