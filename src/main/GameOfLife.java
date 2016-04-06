package main;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
    private List<Integer> world;

    public GameOfLife(List<Integer> world) {
        this.world = world;
    }

    public List<Integer> tick(int cell) {
        checkNeighbours(cell);
        return world;
    }

    private void checkNeighbours(int cell) {
        if (check(neighbours(cell)) < 2) {
            world.set(cell,0);
        }
        if (check(neighbours(cell)) == 3) {
            world.set(cell, 1);
        }
    }

    private List<Integer> neighbours(int cell) {
        List<Integer> neighbours = new ArrayList<>();
        neighbours.add(cell + 1);
        neighbours.add(cell + 2);
        neighbours.add(cell + 3);
        return neighbours;
    }


    private int check(List<Integer> neighbours) {
        int counter = 0;
        for (Integer cell : neighbours) {
            if (world.get(cell) == 1) {
                counter++;
            }
        }
        return counter;
    }

}
