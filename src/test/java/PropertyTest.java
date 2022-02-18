import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Properties;

public class PropertyTest {
    @Test
    public void readPropertiesfromResourcesTest() {
        Properties properties = PropertyReader.getProperties();
        String browser = properties.getProperty("browser");
        Assertions.assertEquals("chrome", browser);
    }
}
