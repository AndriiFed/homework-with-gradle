import  jelementary.Group;
import  jelementary.School;
import  jelementary.people.Student;


public class Main {
  public static void main(String ...args) {

    School school = new School("Fabrika", "Observatorniy, 2/6");

    Group group1 = new Group("QA Manual");
    Group group2 = new Group(".Net with C#");
    Group group3 = new Group("Java Core");

    school.addGroup(group1);
    school.addGroup(group2);
    school.addGroup(group3);

    System.out.println(school.toString());

    Student student1 = new Student("Martin Lutter");
    Student student2 = new Student("John Dole");
    Student student3 = new Student("Katty Stewart");

    group1.addStudent(student1);
    group1.addStudent(student3);

    group2.addStudent(student2);
    group2.addStudent(student1);
    group2.addStudent(student3);

    group3.addStudent(student1);
    group3.addStudent(student3);
    group3.addStudent(student2);

    System.out.println("\n" + group1.toString());
    System.out.println("\n" + group2.toString());
    System.out.println("\n" + group3.toString());
  }
}
