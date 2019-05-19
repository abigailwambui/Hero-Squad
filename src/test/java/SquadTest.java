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
}