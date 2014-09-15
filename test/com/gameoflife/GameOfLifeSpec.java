package com.gameoflife;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by root on 15/9/14.
 */
public class GameOfLifeSpec {

    @Test
    public void cellShouldDieWhenCellHasLessThanTwoNeighbours(){
        //given
        GameOfLife life = new GameOfLife();
        int numberOfNeighbours = 0;
        boolean isAlive = true;
        Cell cell = new Cell(numberOfNeighbours, isAlive);

        //when
        Cell evolvedCell=life.evolve(cell);

        //then
        Assert.assertFalse(evolvedCell.isAlive());
    }

    @Test
    public void cellShouldLiveWhenCellHasTwoOrThreeNeighbours(){
        //given
        GameOfLife life = new GameOfLife();
        int numberOfNeighbours = 2;
        boolean isAlive = true;
        Cell cell = new Cell(numberOfNeighbours, isAlive);

        //when
        Cell evolvedCell=life.evolve(cell);

        //then
        Assert.assertTrue(evolvedCell.isAlive());
    }

    @Test
    public void cellShouldDieWhenCellHasMoreThanThreeNeighbours(){
        //given
        GameOfLife life = new GameOfLife();
        int numberOfNeighbours = 4;
        boolean isAlive = true;
        Cell cell = new Cell(numberOfNeighbours, isAlive);

        //when
        Cell evolvedcell=life.evolve(cell);

        //then
        Assert.assertFalse(evolvedcell.isAlive());
    }

    @Test
    public void theDeadCellShouldRebornWhenCellHasExactlyThreeNeighbours(){
        //given
        GameOfLife life = new GameOfLife();
        int numberOfNeighbours = 3;
        boolean isAlive = false;
        Cell cell = new Cell(numberOfNeighbours, isAlive);

        //when
        Cell evolvedCell=life.evolve(cell);

        //then
        Assert.assertTrue(evolvedCell.isAlive());
    }
}
