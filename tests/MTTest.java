/**
 * マルチスレッドのテスト
 */

package tests;

import lib.MTBase;

public class MTTest {
  public static void main(String[] args) throws InterruptedException {
    // ライブラリでの変数の初期値を表示する
    System.out.println("MTBase initital value: " + MTBase.pub.get());

    System.out.println("---");

    // スレッドを2つ用意してそれぞれに異なる値をセットする
    Thread thread1 = new Thread(() -> {
      System.out.println("thread 1 initial value: " + MTBase.pub.get());
      MTBase.pub.set(100);
      System.out.println("thread 1 value: " + MTBase.pub.get());
    });

    Thread thread2 = new Thread(() -> {
      System.out.println("thread 2 initial value: " + MTBase.pub.get());
      MTBase.pub.set(200);
      System.out.println("thread 2 value after set: " + MTBase.pub.get());
    });

    // スレッドを実行する
    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("---");

    // MTBaseでの初期値を表示する（スレッドに影響されないことを確かめる）
    System.out.println("Main thread final value: " + MTBase.pub.get());

    // System.out.println(MTBase.pri.get());  // The field MTBase.pri is not visible
    // System.out.println(MTBase.pro.get());  // The field MTBase.pro is not visible
  }
}
