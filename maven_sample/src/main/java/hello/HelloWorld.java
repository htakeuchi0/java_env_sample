package hello;

import org.joda.time.LocalTime;

/**
 * 以下で提示されているサンプルクラス．
 * https://qiita.com/marutanseijin/items/b2897539ea94d67739e6
 */
public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
