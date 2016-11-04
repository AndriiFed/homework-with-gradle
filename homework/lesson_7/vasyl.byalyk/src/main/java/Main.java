import  jelementary.Group;
import  jelementary.School;
import  jelementary.people.Student;

public class Main {
  public static void main(String ... args) {
    School hel = new School("HELLEL");
    Group javaElementary = new Group("Java elementary");
    hel.newGroupName(javaElementary);
    Group englishIntermidiate = new Group("English intermidiate");
    hel.newGroupName(englishIntermidiate);
    Student s1 = new Student("Jon Don", 20, 11.5);
    javaElementary.newStudentName(s1);
    Student s2 = new Student("Kon Fon", 21, 12);
    javaElementary.newStudentName(s2);
    englishIntermidiate.newStudentName(s2);
    Student s3 = new Student("Lon Gon", 22, 5);
    javaElementary.newStudentName(s3);
    englishIntermidiate.newStudentName(s3);
    Student s4 = new Student("Zon Hon", 23, 10.2);
    englishIntermidiate.newStudentName(s4);
    Student s5 = new Student("Con Non", 24, 8.9);
    javaElementary.newStudentName(s5);
    englishIntermidiate.newStudentName(s5);
    System.out.println(hel);
    System.out.println(javaElementary);
    System.out.println(englishIntermidiate);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
  }
}
