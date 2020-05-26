package hu.unideb.inf.Core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WallTest {
    @Test
    void testWall(){
        Wall wall = new Wall(10,0);
        assertNotNull(wall);
        assertEquals(10,wall.getWallHeight());
        assertEquals(0,wall.getOrientation());
    }
}
