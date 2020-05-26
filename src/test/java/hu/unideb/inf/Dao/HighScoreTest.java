package hu.unideb.inf.Dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HighScoreTest {
    @Test
    void testHighscore(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);

        assertNotNull(highScore);
    }

    @Test
    void getNameTest(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);

        assertEquals("Player",highScore.getName());
    }

    @Test
    void getScoreTest(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);

        assertEquals("10",highScore.getScore());
    }

    @Test
    void getDateTest(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);

        assertEquals(date,highScore.getDate());
    }

    @Test
    void setNameTest(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);
        highScore.setName("Player");
        assertEquals("Player", highScore.getName());
    }

    @Test
    void setScoreTest(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);
        highScore.setScore("20");
        assertEquals("20", highScore.getScore());
    }

    @Test
    void setDateTest(){
        String date = String.valueOf(LocalDate.now());
        HighScore highScore = new HighScore("Player","10", date);

        LocalDate date2 = LocalDate.of(2013,01,01);
        highScore.setDate(String.valueOf(date2));
        assertEquals(String.valueOf(date2), highScore.getDate());
    }
}
