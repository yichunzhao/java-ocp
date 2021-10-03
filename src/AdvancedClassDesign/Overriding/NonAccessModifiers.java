package AdvancedClassDesign.Overriding;

/**
 * Overriding rule: for Non-access modifiers
 *
 * <p>Is it possible to put non-access modifier on the thread run method?
 *
 * <p>Actually it doesn't show any compiling error message.
 *
 * <p>the following is valid overriding the overriding method and the overridden may have the same
 * or different non-access modifier; the Overriding method and the overridden may have the same or
 * different access-modifier;
 *
 * <p>return type should be the same or covariant method signature should be exactly the same
 * parameter list should be exactly the same. Exception list overriding method throws the same
 * exception, or its sub-class, or without exception
 *
 * <p>the following example is weird. the result is always correct, but it should not be.
 *
 * <p>what is the shared data in this example? the instance of Book; the Synchronize block and
 * method is applied on it, so that it is mutual exclusive.
 */
public class NonAccessModifiers {
  public static void main(String[] args) throws InterruptedException {
    Book book = new Book();
    Thread task1 = new OnlineBuy(book);
    task1.start();
    Thread task2 = new OnlineBuy(book);
    task2.start();
    Thread task3 = new OnlineReturn(book);
    task3.start();

    Thread task4 = new OnlineReturn(book);
    task4.start();
    Thread task5 = new OnlineBuy(book);
    task5.start();

    task1.join();
    task2.join();
    task3.join();
    task4.join();
    task5.join();

    System.out.println(book.copiedSold);
  }

  static class Book {
    int copiedSold = 0;

    public void newSale() {
      ++copiedSold;
    }

    public void returnBook() {
      --copiedSold;
    }

    public int getBookNum() {
      return copiedSold;
    }
  }

  static class OnlineBuy extends Thread {
    private Book book;

    public OnlineBuy(Book book) {
      this.book = book;
    }

    public synchronized void run() {
      System.out.println("one book sold");
      book.newSale();
    }
  }

  static class OnlineReturn extends Thread {
    private Book book;

    public OnlineReturn(Book book) {
      this.book = book;
    }

    public synchronized void run() {
      System.out.println("one book returned");
      book.returnBook();
    }
  }
}
