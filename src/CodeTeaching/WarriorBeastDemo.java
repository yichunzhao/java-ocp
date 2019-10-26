package CodeTeaching;

public class WarriorBeastDemo {
  public static void main(String[] args) {
    //
    Warrior warrior = new Warrior(1000);
    Beast beast = new Beast(5000);

    System.out.println("warrior initial blood amount: "+ warrior.getBloOdAmount());
    System.out.println("beast initial blood amount: "+ beast.getBloodAmount());

    beast.killWarrior(warrior);
    System.out.println("warrior blood amount: " + warrior.getBloOdAmount());

    warrior.killBeast(beast);
    System.out.println("beast blood amount: " + beast.getBloodAmount());

      beast.killWarrior(warrior);
      System.out.println("warrior blood amount: " + warrior.getBloOdAmount());

      warrior.killBeast(beast);
      System.out.println("beast blood amount: " + beast.getBloodAmount());

  }
}
