package javarush.syntax.level5;
/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)

Требования:
•	У класса Rectangle должны быть переменные top, left, width и height с типом int.
•	У класса должен быть хотя бы один конструктор.
•	У класса должно быть хотя бы два конструктора.
•	У класса должно быть хотя бы три конструктора.
•	У класса должно быть хотя бы четыре конструктора.
 */

public class RectangleConstructors15x10x2019 {
    public int left;
    public int top;
    public int width;
    public int height;

    public RectangleConstructors15x10x2019(){
        left = 2;
        top = 3;
        width = 4;
        height = 5;
    }

    public RectangleConstructors15x10x2019(int left, int top){
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }

    public RectangleConstructors15x10x2019(int left, int top, int height){
        this.left = left;
        this.top = top;
        this.height = height;
        width = height;
    }

    public RectangleConstructors15x10x2019(int left, int top, int height, int width){
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args){

    }
}
