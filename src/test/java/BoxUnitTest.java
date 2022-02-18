import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class BoxUnitTest {
    private static int boxSquare;
    private static int boxPerimeter;
    private static double boxAverage;

    @BeforeAll
    public static void setup() {
        Box box = new Box(3, 4, 5);
        boxSquare = box.squareBox();
        boxPerimeter = box.perimeterBox();
        boxAverage = box.averageSide();
    }

    @Test
    public void testSquare() {
        int vol = 60;
        Assertions.assertEquals(vol,boxSquare);
    }

    @Test
    public void testPerimeter() {
        int vol = 12;
        Assertions.assertEquals(vol,boxPerimeter);
    }

    @Test
    public void testAverage() {
        double vol = 4.0;
        Assertions.assertEquals(vol,boxAverage);
    }

}
