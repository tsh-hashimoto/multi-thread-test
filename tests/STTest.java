/**
 * シングルスレッドのテスト
 */

package tests;

import lib.MTBase;

public class STTest {
  public static void main(String[] args) {
    // メインスレッドでのThreadLocal変数の動作確認
    System.out.println("Main thread initial value: " + MTBase.pub.get()); // 0のはず

    System.out.println("---");

    // 値を設定
    MTBase.pub.set(100);
    System.out.println("Main thread after setting 100: " + MTBase.pub.get());  // 100のはず

    // 値を変更
    MTBase.pub.set(200);
    System.out.println("Main thread after setting 200: " + MTBase.pub.get());  // 200のはず

    // 最後に元の値に戻す
    MTBase.pub.set(300);
    System.out.println("Main thread after setting 300: " + MTBase.pub.get());  // 300のはず

    // 値が変更されていることを確認
    assert MTBase.pub.get() == 300 : "Test failed!";  // 300であるべき
    System.out.println("Main thread final value: " + MTBase.pub.get());  // 300のはず
  }
}
