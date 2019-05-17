import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test 
    public void hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("Superman","30");
        assertEquals(true, hero instanceof Hero);
    }
    @Test 
    public void hero_instantiatesWithName_String() {
        Hero hero = new Hero("Superman","30");
        assertEquals("Superman", hero.getName());
    }
    @Test 
    public void hero_instantiatesWithAge_Integer() {
        Hero hero = new Hero("Superman", 30);
        assertEquals("Superman", hero.getAge());
    }
}