package firm;

public interface Payable {
  int WORKING_HOURS_PER_DAY = 8;

  float calculatePayment();
  
  void setWorkingHours(int workingHours);
}
