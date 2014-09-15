package com.gameoflife;

/**
 * Created by root on 15/9/14.
 */
public class Cell {
    private int numberofNeighbours;
    private boolean isAlive;

    public Cell(int numberofNeighbours, boolean isAlive) {
        this.numberofNeighbours = numberofNeighbours;
        this.isAlive = isAlive;
    }

    public int getNumberofNeighbours() {
        return numberofNeighbours;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
