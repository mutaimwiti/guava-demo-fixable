package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void joinsWithGuava() {
    assertEquals("guava, demo", Joiner.on(", ").join(ImmutableList.of("guava", "demo")));
  }
}
