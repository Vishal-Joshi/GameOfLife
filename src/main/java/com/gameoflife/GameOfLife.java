package com.gameoflife;

/**
 * Created by root on 15/9/14.
 */
public class GameOfLife {


    public Cell evolve(final Cell cell) {
        if(cell.isAlive()) {
            if (cell.getNumberofNeighbours() < 2 || cell.getNumberofNeighbours() > 3) {
                return new Cell(cell.getNumberofNeighbours(),false);
            }
        } else{
            if (cell.getNumberofNeighbours() == 3) {
                return new Cell(cell.getNumberofNeighbours(),true);
            }
        }
        return cell;
    }
}
