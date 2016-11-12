package firm;

public enum PaymentPeriod {
  WEEKLY(5), BIWEEKLY(10), MONTHLY(20);

  int daysNumber;

  PaymentPeriod(int daysNumber) {
    this.daysNumber = daysNumber;
  }

  public int getDaysNumber() {
    return daysNumber;
  }
}
