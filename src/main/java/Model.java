/**
 * @author Alessio Manià - IN2000247
 */
public class Model {
  public static int return0() {
    return 0;
  }

  public static int return4() {
    return return3() + return1();
  }

  public static int return3() {
    return return2() + return1();
  }

  public static int return1() {
    return 1;
  }

  public static int return2() {
    return 1 + return1();
  }

  public static int return5() {
    return return3() + return2();
  }

  public static int return6() {
    return return2() * return3();
  }
}