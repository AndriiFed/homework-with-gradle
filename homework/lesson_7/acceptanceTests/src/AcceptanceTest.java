import org.junit.Test;

import jelementary.School;
import jelementary.Group;
import jelementary.people.Student;

public class AcceptanceTest {
  @Test
  public void testClassesDirectoryStructureCorrectness() {
    new School();
    new Group();
    new Student();

    // these classes have to be places as it is in the HW description
    // remember about 'public' modifier for classes
    // don't forget to create a default constructor
  }

  @Test
  public void testMainIsOkay() {
    Main.main(new String[0]);
  }
}
