package main;

import java.util.List;

public class GameOfLife {
    private List<Integer> world;

    public GameOfLife(List<Integer> world) {
        this.world = world;
    }

    public List<Integer> tick() {
        checkNeighbours();
        return world;
    }

    private void checkNeighbours() {
        world.set(0, 0);
    }
}
