package demo;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

public final class App {
  public static void main(String[] args) {
    System.out.println(Joiner.on(", ").join(ImmutableList.of("guava", "demo")));
  }
}
