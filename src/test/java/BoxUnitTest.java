import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoxUnitTest {
    private static int boxSquare;
    private static int boxPerimeter;
    private static double boxAverage;

    @BeforeClass
    public static void setup() {
        Box box = new Box(3, 4, 5);
        boxSquare = box.squareBox();
        boxPerimeter = box.perimeterBox();
        boxAverage = box.averageSide();
    }

    @Test
    public void testSquare() {
        int vol = 60;
        Assert.assertEquals(vol, boxSquare);
    }

    @Test
    public void testPerimeter() {
        int vol = 12;
        Assert.assertEquals(vol, boxPerimeter);
    }

    @Test
    public void testAverage() {
        double vol = 4.0;
        Assert.assertEquals(vol, boxAverage, 0.01);
    }

}
