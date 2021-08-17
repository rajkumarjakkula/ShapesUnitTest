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

}
