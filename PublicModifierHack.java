public class PublicModifierHack {

  public static void main(String[] args) {
    Object object = new Object() {
      public void cannotAccessMeHaHaHa() {
        System.out.println("Try to invoke me!");
      }
    };
    //Cannot invoke public method if it is not invoked immediately upon creation of anonymous class.
  }
}
