import  jelementary.Group;
import  jelementary.School;
import  jelementary.people.Student;

public class Main {
  public static void main(String ... args) {
    Student st1 = new Student("Vasil Pupkin", 24, 1);
    System.out.println(st1.toString());

    Student st2 = new Student("Dadya Fedor", 21, 2);
    System.out.println(st2.toString());

    Group gr1 = new Group("Jelementary", 12);
    gr1.addStudent(st1);
    System.out.println(gr1.toString());

    Group gr2 = new Group("Q&A", 13);
    System.out.println(gr2.toString());

    Group gr3 = new Group("English intermidiate", 7);
    gr3.addStudent(st1);
    gr3.addStudent(st2);

    School sch1 = new School("Hillel", "Kanatnaya str.");
    sch1.addGroup(gr1);
    sch1.addGroup(gr2);
    sch1.addGroup(gr3);
    System.out.println(sch1.toString());

    School sch2 = new School("IT school", "Paustovskogo str.");
    System.out.println(sch2.toString());

  }
}
