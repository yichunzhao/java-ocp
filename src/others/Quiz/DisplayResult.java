package others.Quiz;

public class DisplayResult {
  private boolean flag;

  public static void main(String[] args) {
    new DisplayResult().displayResult();
  }

  public void displayResult() {
    int result = flag ? 5 : 10;
    System.out.println("Result=" + result++);
  }
}
