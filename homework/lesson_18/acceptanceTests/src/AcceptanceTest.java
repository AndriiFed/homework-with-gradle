import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import algo.BSTMap;

public class AcceptanceTest {
  @Test
  public void BasedOnBSTMapTestingWithDelete() {
    BSTMap<Integer, String> map = new BSTMap<>();

    map.put(10, "Ten");
    map.put(20, "Twenty");
    map.put(30, "Thirty");
    map.put(40, "Fourty");

    map.delete(30);

    assertThat(map.get(10), is("Ten"));
    assertThat(map.get(20), is("Twenty"));
    assertThat(map.get(40), is("Fourty"));
    assertThat(map.get(30), is(nullValue()));
    assertThat(map.get(100), is(nullValue()));
  }
}
