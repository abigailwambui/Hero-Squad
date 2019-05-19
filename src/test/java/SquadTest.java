import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test 
    public void squad_instantiatesCorrectly_true() {
        Squad squad = new Squad("PowerPuff Girls", "30");
        assertEquals(true, squad instanceof Squad);
    }
    @Test 
    public void squad_instantiatesWithName_String() {
        Squad squad = new Squad("PowerPuff Girls", "30");
        assertEquals("PowerPuff Girls", squad.getName());
    }
    @Test 
    public void squad_instantiatesWithSize_String() {
        Squad squad = new Squad("PowerPuff Girls", "30");
        assertEquals("30", squad.getSize());
    }
}