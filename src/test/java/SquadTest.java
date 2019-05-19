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
}