package CodeTeaching;

public class Beast {
  private int bloodAmount;
  private int damageAmount;
  private boolean death;

  public Beast(int bloOdAmount) {
    this.bloodAmount = bloOdAmount;
    this.damageAmount = 50;
  }

  public void killWarrior(Warrior warrior) {
      warrior.beDamaged(this.damageAmount);
  }

  public void beDamaged(int bloodLost) {
    if (bloodLost <= 0) return;
    if (bloodAmount > 0) bloodAmount -= bloodLost;
    else {
      System.out.println("beast is already died");
    }
  }

    public double getBloodAmount() {
        return bloodAmount;
    }

    public int getDamageAmount() {
        return damageAmount;
    }
}
