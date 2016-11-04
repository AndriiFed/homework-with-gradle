package jelementary;

import  jelementary.people.Student;

public class Group {
  public String name;
  public int countStudent;
  public String[] group;

  public Group() {
  }

  public Group(String newName) {
    name = newName;
    group = new String[0];
  }

  public String toString() {
    String str = "Group info: name - " + name + "; count Student - ";
    str += countStudent + "; Students: ";
    for (int i = 0 ; i < group.length ; i++) {
      str += group[i] + ", ";
    }
    return str;
  }

  public void newStudentName(Student newName) {
    String[] gname = new String[group.length + 1];
    for (int i = 0 ; i < group.length ; i++) {
      gname[i] = group[i];
    }
    gname[group.length] = newName.name;
    group = gname;
    plusStudent();
  }

  public void plusStudent() {
    countStudent++;
  }

}
