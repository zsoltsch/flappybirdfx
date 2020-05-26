package hu.unideb.inf.Core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShipTest {
    @Test
    void testShip(){
        Ship ship = new Ship();
        assertNotNull(ship);
    }

    @Test
    void testmoveX(){
        Ship ship = new Ship();
        ship.moveX(20);
        assertEquals(120.0,ship.getTranslateX(),1);
    }
    @Test
    void testmoveY(){
        Ship ship = new Ship();
        ship.moveY(20);
        assertEquals(320.0,ship.getTranslateY(),1);
    }

    @Test
    void testjump(){
        Ship ship = new Ship();
        ship.jump();
        assertEquals(3,ship.velocity.getX(),1);
        assertEquals(-15,ship.velocity.getY(),1);
    }

    @Test
    void testshipNull(){
        Ship ship = new Ship();
        ship.shipNull();
        assertEquals(100,ship.getTranslateX(),1);
        assertEquals(300,ship.getTranslateY(),1);
        assertEquals(0,ship.velocity.getX(),1);
        assertEquals(0,ship.velocity.getY(),1);
    }
}
