import jelementary.Group;
import jelementary.School;
import jelementary.people.Student;

class Main {

  public static void main(String[] args) {
    School sch = new School("Hillel", 10);

    Group grp1 = new Group("Java Elementary", "Dmitry Butakov", 12);
    sch.addGroups(grp1);
    Group grp2 = new Group("Android Dev", "Konstantin Botnar", 15);
    Group grp3 = new Group("Upper-Intermediate English", "Alyona Budina", 10);
    sch.addGroups(grp2, grp3);

    Student std1 = new Student("Ivan Ivanov", 20);
    Student std2 = new Student("Pyotr Petrov", 25);
    Student std3 = new Student("Semen Semeon", 27);

    grp1.addStudents(std1, std2, std3);
    grp2.addStudents(std2, std3);
    grp3.addStudents(std1);

  }

}
