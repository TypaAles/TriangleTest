import org.testng.annotations.Test;
import src.main.*;

import static org.testng.Assert.*;

public class MainTest {
    @Test
    void func() {
        assertTrue(Main.isIsosceles(Main.lenght1, Main.lenght2, Main.lenght3));
        assertTrue(Main.isEquilateral(Main.lenght1, Main.lenght2, Main.lenght3));
        assertTrue(Main.isRight_angled(Main.lenght1, Main.lenght2, Main.lenght3));
    }
}