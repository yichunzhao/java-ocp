package CodeTeaching;

public class Warrior {
  private int bloOdAmount;
  private int damageAmountCapability;

  public Warrior(int bloodAmount) {
    this.bloOdAmount = bloodAmount;
    damageAmountCapability = 10;
  }

  public void beDamaged(int dBlood) {
    if (dBlood <= 0) return;
    if (bloOdAmount > 0) bloOdAmount -= dBlood;
    else {
      System.out.println("warrior is already died");
    }
  }

  public void killBeast(Beast beast){
      beast.beDamaged(this.damageAmountCapability);
  }

    public int getBloOdAmount() {
        return bloOdAmount;
    }

    public int getDamageAmountCapability() {
        return damageAmountCapability;
    }


}
