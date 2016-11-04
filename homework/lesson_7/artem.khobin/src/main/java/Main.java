import jelementary.Group;
import jelementary.School;
import jelementary.people.Student;

class Main {
  public static void main(String ... args) {
    School school = new School("Hillel");
    Group firstGroup = new Group("Java", school);
    Group secondGroup = new Group("English", school);
    school.addGroup(firstGroup);
    school.addGroup(secondGroup);

    System.out.println(school);
    System.out.println("");

    System.out.println(firstGroup);
    System.out.println(secondGroup);
    System.out.println("");

    Student vasya = new Student("Vasya Vasin");
    Student ololosha = new Student("Ololosha Ololoev");

    firstGroup.addStudent(vasya);
    firstGroup.addStudent(ololosha);
    secondGroup.addStudent(ololosha);

    System.out.println(ololosha);
    System.out.println(vasya);
  }
}
