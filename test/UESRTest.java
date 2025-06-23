import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ibtissam
 */
public class UESRTest {

    @Test
    public void testConstructorAndGetNom() {
        String expectedNom = "Alice";
        UESR user = new UESR(expectedNom);
        assertEquals(expectedNom, user.getNom());
    }

    @Test
    public void testGetNomWithMouin() {
        UESR user = new UESR("mouin");
        assertEquals("mouin", user.getNom());
    }

    @Test
    public void testGetNomWithSpecialCharacters() {
        UESR user = new UESR("Mouin@2024!");
        assertEquals("Mouin@2024!", user.getNom());
    }

    @Test
    public void testGetNomWithWhitespace() {
        UESR user = new UESR("   ");
        assertEquals("   ", user.getNom());
    }
}
