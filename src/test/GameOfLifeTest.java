package test;

import main.GameOfLife;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {

    @Test
    public void worldNoLiveCellsReturnsEmptyWorld() {
        List<Integer> world = Arrays.asList(0, 0, 0, 0);
        GameOfLife game = new GameOfLife(world);
        assertEquals(world, game.tick(0));
    }
    
    @Test
    public void worldWithOneLiveCellReturnsEmptyWorld() {
        List<Integer> world = Arrays.asList(1, 0, 0, 0);
        List<Integer> emptyWorld = Arrays.asList(0, 0, 0, 0);
        GameOfLife game = new GameOfLife(world);
        assertEquals(emptyWorld, game.tick(0));
    }
    
    @Test
    public void worldWithOneDeadCellReturnsFourLiveCells() {
        List<Integer> world = Arrays.asList(0, 1, 1, 1);
        List<Integer> fullWorld = Arrays.asList(1, 1, 1, 1);
        GameOfLife game = new GameOfLife(world);
        assertEquals(fullWorld, game.tick(0));
    }
}
