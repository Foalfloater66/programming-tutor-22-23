import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CustomArrayListTest {
    private CustomArrayList<String> album;

    @Before
    public void setup(){
        this.album = new CustomArrayList<>();
    }

    @ParameterizedTest
    @ValueSource(strings = {"WUSYANAME"})
    public void addTest(String text){
        this.album.add(text);
        assertTrue(Arrays.asList(this.album.array).contains(text));
    }

    @Test
    public void addAllTest(){
        CustomArrayList<String> album2 = new CustomArrayList<>();
        album2.add("IGOR'S THEME");
        album2.add("EARFQUAKE");
        album2.add("I THINK");
        this.album.addAll(album2);
        assertEquals("IGOR'S THEME", this.album.array[0]);
        assertEquals("EARFQUAKE", this.album.array[1]);
        assertEquals("I THINK", this.album.array[2]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"WUSYANAME"})
    public void getTest(String text){
        this.album.add(text);
        assertEquals(this.album.get(0), text);
    }

    @ParameterizedTest
    @ValueSource(strings = {"WUSYANAME"})
    public void removeViaElementTest(String text){
        this.album.add(text);
        this.album.remove(text);
        assertFalse(Arrays.asList(this.album.array).contains(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"LUMBERJACK"})
    public void removeViaIndexTest(String text){
        this.album.add(text);
        this.album.remove(0);
        assertFalse(Arrays.asList(this.album.array).contains(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"LEMONHEAD"})
    public void containsTest(String text){
        this.album.add(text);
        assertTrue(this.album.contains(text));
        this.album.remove(0);
        assertFalse(this.album.contains(text));
    }

    @Test
    public void indexOfTest(){
        this.album.add("HOT WIND BLOWS");
        this.album.add("MASSA");
        assertEquals(0, this.album.indexOf("HOT WIND BLOWS"));
        assertEquals(1, this.album.indexOf("MASSA"));
        this.album.remove(0);
        assertEquals(0, this.album.indexOf("MASSA"));
    }

    @Test
    public void sizeTest(){
        this.album.add("HOT WIND BLOWS");
        this.album.add("MASSA");
        this.album.add("LEMONHEAD");
        assertEquals(3, this.album.size());
    }

}
