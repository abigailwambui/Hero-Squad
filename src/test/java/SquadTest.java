import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test 
    public void squad_instantiatesCorrectly_true() {
        Squad squad = new Squad("PowerPuff Girls");
        assertEquals(true, squad instanceof Squad);
    }
    @Test 
    public void squad_categoryInstantiatesWithName_String() {
        Squad squad = new Squad("PowerPuff Girls");
        assertEquals("PowerPuff Girls", squad.getName());
    }
}