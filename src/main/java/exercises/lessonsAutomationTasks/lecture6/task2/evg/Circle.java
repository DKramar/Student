package exercises.lessonsAutomationTasks.lecture6.task2.evg;

import static java.lang.Math.PI;

import java.util.Objects;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return PI * radius * radius;
  }

  @Override
  public CenterCoordinates getCentreCoordinatesOfInscribedCircle() {
    return new CenterCoordinates(radius, radius);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj instanceof Circle) {
      Circle other = (Circle) obj;
      return Objects.equals(radius, other.radius);
    }
    return false;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Circle with " + "radius = " + radius;
  }
}
