package exercises.lessonsAutomationTasks.lecture6.task2.evg;

public class Demo {

  public static void main(String[] args) {
    Shape square = new Square(12.5);
    Shape squareTwo = new Square(12.5);

    Shape circle = new Circle(7.47);
    Shape circleTwo = new Circle(7.47);

    System.out.println(square);
    System.out.println("The area of the square : " + square.getArea());
    System.out.println("The coordinates of centre of inscribed circle : " + square.getCentreCoordinatesOfInscribedCircle());
    System.out.println("square and squareTwo are equals : " + square.equals(squareTwo));

    System.out.println(circle);
    System.out.println("The area of the circle : " + circle.getArea());
    System.out.println("The coordinates of centre of inscribed circle : " + circle.getCentreCoordinatesOfInscribedCircle());
    System.out.println("circle and circleTwo are equals : " + circle.equals(circleTwo));

  }

}
