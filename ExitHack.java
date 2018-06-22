
public class ExitHack
{
  public static void main(String[] args)
  {
     final Thread mainThread = java.lang.Thread.currentThread();
     java.lang.Runtime.getRuntime().runFinalizersOnExit(true);

    new Object(){
      protected void finalize(){
        mainThread.stop();
      }
    };
    
    try {
      System.out.println("try running...");
	    java.lang.System.exit(0);
    } finally {
      System.out.println("finally running...");
    }
  }
}
