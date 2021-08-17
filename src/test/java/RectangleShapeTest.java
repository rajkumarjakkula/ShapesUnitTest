import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleShapeTest {
    private RectangleShape object;
    @BeforeEach
    void CreateObject() {object=new RectangleShape();}

    @Test
    @DisplayName("Area of Rectangle")
    void toGetEightWhenFindingAreaOfRectangleLengthFourAndWidthTwo()
    {
        int expectedvalue=8;
        int actualvalue=object.RectangleArea(4,2);
        assertEquals(expectedvalue,actualvalue);
    }

    @Test
    @DisplayName("Area of Rectangle")
    void toGetFortyEightWhenFindingAreaOfRectangleLengthEightAndWidthSix()
    {
        int expectedvalue=48;
        int actualvalue=object.RectangleArea(8,6);
        assertEquals(expectedvalue,actualvalue);
    }

    @Test
    @DisplayName("Perimeter of Rectangle")
    void toGetTweleveWhenFindingPerimeterOfRectangleLengthFourAndWidthTwo()
    {
        int expectedvalue=12;
        int actualvalue=object.RectanglePerimeter(4,2);
        assertEquals(expectedvalue,actualvalue);
    }

    @Test
    @DisplayName("Perimeter of Rectangle")
    void toGetTwentyEightWhenFindingPerimeterOfRectangleLengthEightAndWidthSix()
    {
        int expectedvalue=28;
        int actualvalue=object.RectanglePerimeter(8,6);
        assertEquals(expectedvalue,actualvalue);
    }

}
