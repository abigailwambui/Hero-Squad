import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test 
    public void hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("Superman");
        assertEquals(true, hero instanceof Hero);
    }
    @Test 
    public void hero_instantiatesWithName_String() {
        Hero hero = new Hero("Superman");
        assertEquals("Superman", hero.getName());
    }
}