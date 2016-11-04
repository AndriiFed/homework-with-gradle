import jelementary.Group;

import jelementary.School;

import jelementary.people.Student;

public class Main {

  public static void main(String[] args) {

    Student student1 = new Student();
    student1.setName("Ivan Petrov");
    student1.setAge(21);

    Student student2 = new Student();
    student2.setName("Petr Stepanov");
    student2.setAge(24);

    Student student3 = new Student();
    student3.setName("Aleksey Rybin");
    student3.setAge(30);

    Student student4 = new Student();
    student4.setName("Ilya Kon");
    student4.setAge(35);

    Student student5 = new Student();
    student5.setName("Alexander Bor");
    student5.setAge(28);

    Student student6 = new Student();
    student6.setName("Sidor Alekseev");
    student6.setAge(29);

    Group jelementary  = new Group();
    jelementary.setGroupName("Java Elementary");
    jelementary.addStudent(student1);
    jelementary.addStudent(student2);
    jelementary.addStudent(student3);

    Group qa  = new Group();
    qa.setGroupName("QA Manual");
    qa.addStudent(student4);
    qa.addStudent(student5);
    qa.addStudent(student6);

    Group frontEnd  = new Group();
    frontEnd.setGroupName("Front End Basic");
    frontEnd.addStudent(student2);
    frontEnd.addStudent(student4);
    frontEnd.addStudent(student6);

    School school  = new School();
    school.setSchoolName("Programmnig school No 1");
    school.addGroup(jelementary);
    school.addGroup(qa);
    school.addGroup(frontEnd);

    System.out.println(school.getSchoolFullInfo());
  }
}
