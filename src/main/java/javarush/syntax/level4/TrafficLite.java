package javarush.syntax.level4;

import java.util.Scanner;

public class TrafficLite {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double t = input.nextDouble();
    showTrafficLite(t);
  }

  private static void showTrafficLite(double minuteValue) {
    for (int i = 0; i <= minuteValue; i+=5) {
      if (minuteValue >= i & minuteValue < i+3) {
        System.out.println("green");
        break;
      }
      else if (minuteValue >= i+3 & minuteValue < i+4) {
        System.out.println("yellow");
        break;
      }
      else if (minuteValue >= i+4 & minuteValue < i+5) {
        System.out.println("red");
        break;
      }
    }
  }
}
