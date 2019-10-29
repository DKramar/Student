package javarush.syntax.level5;
/*
Создать класс (Circle08x10x2019) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Circle08x10x2019 должны быть переменные centerX, centerY, radius, width и color с типом int.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
 */

public class Circle08x10x2019 {
    public int centerX; // переменная класса
    public int centerY; // переменная класса
    public int radius; // переменная класса
    public int width; // переменнная класса
    public int color; // переменная класса

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX; // переменной класса присвоили имя параметра(параметр)
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args){

    }

}
