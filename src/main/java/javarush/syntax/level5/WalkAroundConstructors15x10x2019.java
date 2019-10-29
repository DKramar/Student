package javarush.syntax.level5;
/*
Создать класс (CircleConstructors15x10x2019) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color

Требования:
•	У класса CircleConstructors15x10x2019 должны быть переменные centerX, centerY, radius, width и color с типом int.
•	У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
 */

public class WalkAroundConstructors15x10x2019 {
    public int centerX;
    public int centerY;
    public int radius;
    public int width;
    public int color;

    public WalkAroundConstructors15x10x2019(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public WalkAroundConstructors15x10x2019(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public WalkAroundConstructors15x10x2019(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args){

    }
}
