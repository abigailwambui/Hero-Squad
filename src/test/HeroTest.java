import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test 
    public void hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("Superman","30", "Extreme might","Ladies");
        assertEquals(true, hero instanceof Hero);
    }
    @Test 
    public void hero_instantiatesWithName_String() {
        Hero hero = new Hero("Superman","30", "Extreme might","Ladies");
        assertEquals("Superman", hero.getName());
    }
    @Test 
    public void hero_instantiatesWithAge_Integer() {
        Hero hero = new Hero("Superman", 30, "Extreme might","Ladies");
        assertEquals(30, hero.getAge());
    }
    @Test 
    public void hero_instantiatesWithPower_String() {
        Hero hero = new Hero("Superman", 30, "Extreme might","Ladies");
        assertEquals("Extreme might", hero.getPower());
    }
     @Test 
    public void hero_instantiatesWithWeakness_String() {
        Hero hero = new Hero("Superman", 30, "Extreme might","Ladies");
        assertEquals("Ladies", hero.getWeakness());
    }
}