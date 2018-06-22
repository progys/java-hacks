/**
 * Purpose of this hack is to demonstrate that it is possible to run the code even after
 * System.exit() is executed.
 *
 * @author progys
 */

public class ExitHack {

  public static void main(String[] args) {
    final Thread mainThread = Thread.currentThread();
    Runtime.runFinalizersOnExit(true);

    new Object() {
      @Override
      protected void finalize() {
        mainThread.stop();
      }
    };

    try {
      System.out.println("try running...");
      System.exit(0);
    } finally {
      System.out.println("finally running...");
    }
  }
}
