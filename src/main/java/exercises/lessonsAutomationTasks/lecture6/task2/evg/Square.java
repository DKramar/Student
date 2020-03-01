package exercises.lessonsAutomationTasks.lecture6.task2.evg;

import java.util.Objects;

public class Square extends Shape {

  private double sideLength;

  public Square(double sideLength) {
    this.sideLength = sideLength;
  }

  public double getSideLength() {
    return sideLength;
  }

  public void setSideLength(double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double getArea() {
    return sideLength * sideLength;
  }

  @Override
  public CenterCoordinates getCentreCoordinatesOfInscribedCircle() {
    return new CenterCoordinates(sideLength / 2, sideLength / 2);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj instanceof Square) {
      Square other = (Square) obj;
      return Objects.equals(sideLength, other.sideLength);
    }
    return false;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Square with " + "sideLength = " + sideLength;
  }
}
