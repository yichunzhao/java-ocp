package Threads.immutable;

/**
 * Immutable objects are thread-safe; for its states cannot be modified.
 *
 * <p>1.final class that cannot be extended, so that it cannot be overridden to modify the states.
 * 2.private variables so that states cannot be manipulated externally. 3.final variables preventing
 * from being re-assigned. 4. return a clone of value, so that modification via reference
 * impossible.
 */
import java.util.Date;

public class BirthDateImmutable {
  public static void main(String[] args) {
    BirthDate birthDate = new BirthDateImmutable().new BirthDate(new Date());
    System.out.println("original date: " + birthDate.getBirthDate());

    Date another = birthDate.getBirthDate();
    System.out.println("another: " + another);
    another.setTime(2001);
    System.out.println("modifying another: " + another);
    System.out.println("birth-date after modification: " + birthDate.getBirthDate());
  }

  final class BirthDate {
    private final Date birth;

    public BirthDate(Date birth) {
      this.birth = (Date) birth.clone();
    }

    public final Date getBirthDate() {
      return (Date) birth.clone();
    }

    public boolean isOlder(Date other) {
      boolean isOlder = birth.before(other);
      return isOlder;
    }
  }
}
