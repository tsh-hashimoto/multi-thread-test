package lib;

public class MTBase {
  public static ThreadLocal<Integer> pub = ThreadLocal.withInitial(() -> 0);
  private static ThreadLocal<Integer> pri = ThreadLocal.withInitial(() -> 1);
  protected static ThreadLocal<Integer> pro = ThreadLocal.withInitial(() -> 2);
  public static void main(String[] args) {
    System.out.println(pub.get());
    System.out.println(pri.get());
    System.out.println(pro.get());
  }
}
