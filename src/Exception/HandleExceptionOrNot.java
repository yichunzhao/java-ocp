package Exception;

public class HandleExceptionOrNot {

  public static void main(String[] args) {
    //
    int x = -10;
    if (x < 0) throw new IllegalArgumentException();
  }
}
