import jelementary.Group;
import jelementary.School;
import jelementary.people.Student;

class Main {
  public static void main(String ... args) {
    School school = new School("Hillel", "Kanatnaya str., 22");

    Group group1 = new Group("Java Elementary");
    Group group2 = new Group("Front-End");
    Group group3 = new Group("QA");
    Group group4 = new Group("English course");

    school.addGroup(group1);
    school.addGroup(group2);
    school.addGroup(group3);
    school.addGroup(group4);

    System.out.println(school.toString());

    Student student1 = new Student("John Gibbs");
    Student student2 = new Student("Henry Adams");
    Student student3 = new Student("Thomas Smith");

    group1.addStudent(student1);
    group1.addStudent(student2);
    group1.addStudent(student3);
    group4.addStudent(student1);
    group4.addStudent(student2);
    group2.addStudent(student3);

    System.out.println("\n" + group1.toString());
    System.out.println("\n" + group4.toString());
    System.out.println("\n" + group2.toString());
    System.out.println("\n" + group3.toString());
  }
}