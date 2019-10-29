package javarush.syntax.level2;

import javarush.syntax.level5.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(18, rectangle.perimeter(4, 5), 0);
    }

    @Test
    public void shouldCalculateSquare(){
        Rectangle rectangle1 = new Rectangle();
        assertEquals(20, rectangle1.square(4, 5), 0);
    }
}
