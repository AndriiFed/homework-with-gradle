package jelementary;

import  jelementary.people.Student;

public class School {
  public String name;
  public String[] group;

  public School() {
  }

  public School(String newName) {
    name = newName;
    group = new String[0];
  }

  public String toString() {
    String str = "School info: name - " + name + "; School group - ";
    for (int i = 0 ; i < group.length ; i++) {
      str += group[i] + ", ";
    }
    str += ";" ;
    return str;
  }

  public void newGroupName(Group newName) {
    String[] gname = new String[group.length + 1];

    for (int i = 0 ; i < group.length ; i++) {
      gname[i] = group[i];
    }
    gname[group.length] = newName.name;
    group = gname;
  }
}
