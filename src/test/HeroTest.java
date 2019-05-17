import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    public void hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("Superman");
        assertEquals(true, hero instanceof Hero);
    }
}