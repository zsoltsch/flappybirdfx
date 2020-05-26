package hu.unideb.inf.Core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static hu.unideb.inf.Core.Main.failGame;
import static hu.unideb.inf.Core.Main.winHeight;
import static java.lang.Math.random;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrachTest {
    @Test
    void testWalls(){
        ArrayList<Wall> walls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int enter = (int)(random()*100+100);
            int height = new Random().nextInt(winHeight-enter);
            Wall wall = new Wall(height, 1);
            wall.setTranslateX(i*350+winHeight);
            wall.setTranslateY(0);
            walls.add(wall);
        }
        assertNotNull(walls);
    }

    @Test
    void testShip(){
        Ship ship = new Ship();
        assertNotNull(ship);
    }

    @Test
    void crachTest(){
        Ship ship = new Ship();
        ship.jump();
        while (!failGame) {
            if (ship.velocity.getY() < 5) {
                ship.velocity = ship.velocity.add(0, 1);
            }
            ship.moveX((int) ship.velocity.getX());
            ship.moveY((int) ship.velocity.getY());
        }
        assertTrue(failGame);
    }
}
