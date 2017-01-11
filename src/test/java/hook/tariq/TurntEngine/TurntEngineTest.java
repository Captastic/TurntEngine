package hook.tariq.TurntEngine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by thook on 1/11/17.
 */
public class TurntEngineTest {

    TurntEngine turntEngine;

    @Before
    public void setUp(){
        turntEngine = new TurntEngine();
    }

    @Test
    public void getTurntLevelTest(){
        Double expected = 1.0;
        Double actual = turntEngine.getTurntLevel();
        assertEquals("I expect that the turnt level will be 1.0",expected,actual);
    }

    @Test
    public void setTurntLevelTest(){
        Double expected = 5.0;
        turntEngine.setTurntLevel(5.0);
        Double actual = turntEngine.getTurntLevel();
        assertEquals("I expect that the turnt level will be 5.0",expected,actual);

    }

    @Test
    public void isLitTest(){
        Boolean actual = turntEngine.isLit();
        assertTrue("Should be equal to true", actual);
    }

}
