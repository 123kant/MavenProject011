import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoxUnitTest {
    Box box = new Box(3, 4, 5);
    int box1 = box.squareBox();
    int box2 = box.perimeterBox();
    double box3 = box.averageSide();

    @Test
    public void testSquare() {
        int vol = 60;
        Assert.assertEquals(vol, BoxUnitTest.this.box1);
    }

    @Test
    public void testPerimeter() {
        int vol = 12;
        Assert.assertEquals(vol, BoxUnitTest.this.box2);
    }

    @Test
    public void testAverage() {
        double vol = 4.0;
        Assert.assertEquals(vol, BoxUnitTest.this.box3, 0.01);
    }

}
