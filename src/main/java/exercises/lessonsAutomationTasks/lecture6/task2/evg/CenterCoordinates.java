package exercises.lessonsAutomationTasks.lecture6.task2.evg;

public class CenterCoordinates {

  private double abscissa;

  private double ordinate;

  public CenterCoordinates(double abscissa, double ordinate) {
    this.abscissa = abscissa;
    this.ordinate = ordinate;
  }

  public double getAbscissa() {
    return abscissa;
  }

  public void setAbscissa(double abscissa) {
    this.abscissa = abscissa;
  }

  public double getOrdinate() {
    return ordinate;
  }

  public void setOrdinate(double ordinate) {
    this.ordinate = ordinate;
  }

  @Override
  public String toString() {
    return  "abscissa=" + abscissa + ", ordinate=" + ordinate;
  }
}
