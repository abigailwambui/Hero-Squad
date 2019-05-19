import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test 
    public void squad_instantiatesCorrectly_true() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        assertEquals(true, squad instanceof Squad);
    }
    @Test 
    public void squad_instantiatesWithName_String() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        assertEquals("PowerPuff Girls", squad.getName());
    }
    @Test 
    public void squad_instantiatesWithSize_String() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        assertEquals("30", squad.getSize());
    }
    @Test 
    public void squad_instantiatesWithCause_String() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        assertEquals("Fight for Equality", squad.getCause());
    }
    @Test 
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        Squad secondSquad = new Squad("Famous Five", "5", "Speak up for Children Rights");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }
     @Test 
    public void clear_emptiesAllSquadsFromList_0() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
    @Test 
    public void getId_instantiateSquadsWithAnId_1() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        assertEquals(1, squad.getId());
    }
    @Test 
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad firstSquad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        Squad secondSquad = new Squad("Famous Five", "5", "Speak up for Children Rights");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }
     @Test 
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        assertEquals(0, squad.getHeroes().size());
    }

    @Test 
    public void addHero_addsHeroToList_true() {
        Squad squad = new Squad("PowerPuff Girls", "30", "Fight for Equality");
        Hero hero = new Hero("Superman",30, "Extreme might","Ladies");
        squad.addHero(hero);
        assertTrue(squad.getHeroes().contains(hero));
    }

    @Test 
    public void find_returnsNullWhenNoHeroFound_null() {
        assertTrue(Squad.find(999) == null);
    }
}