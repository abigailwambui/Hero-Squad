import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test 
    public void hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("Superman",30, "Extreme might","Ladies");
        assertEquals(true, hero instanceof Hero);
    }
    @Test 
    public void hero_instantiatesWithName_String() {
        Hero hero = new Hero("Superman",30, "Extreme might","Ladies");
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
    @Test 
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("Superman",30, "Extreme might","Ladies");
        Hero secondTask = new Task("Batman",35, "Fast car", "Sleep");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }
    @Test 
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero myHero = new Hero("Superman",30, "Extreme might","Ladies");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test 
    public void getId_heroesInstantiateWithAnID_1() {
        Hero.clear(); 
        Hero myHero = new Hero("Superman",30, "Extreme might","Ladies");
        assertEquals(1, myHero.getId());
    }
    @Test 
    public void find_returnsHeroWithSmeId_secondHero() {
        Hero firstHero = new Hero("Superman",30, "Extreme might","Ladies");
        Task secondHero = new Hero("Batman",35, "Fast car", "Sleep");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }

}