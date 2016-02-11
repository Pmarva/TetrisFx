package ee.itcollege.tetris.tests;

import ee.itcollege.tetris.parts.Block;
import ee.itcollege.tetris.parts.Figure;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mmartins on 11.02.2016.
 */
public class FigureTest {
    private static final double PRECISION = .001;

    @Test
    public void testRotateClockwise() {
        Figure figure = new Figure();
        Block block = new Block(1, 2);
        figure.getChildren().add(block);
        assertEquals(Block.SIZE * 1, block.getX(), PRECISION);
        assertEquals(Block.SIZE * 2, block.getY(), PRECISION);

        figure.rotateClockwise();
        assertEquals(Block.SIZE * -2, block.getX(), PRECISION);
        assertEquals(Block.SIZE * 1, block.getY(), PRECISION);

        figure.rotateClockwise();
        assertEquals(Block.SIZE * -1, block.getX(), PRECISION);
        assertEquals(Block.SIZE * -2, block.getY(), PRECISION);

        figure.rotateClockwise();
        assertEquals(Block.SIZE * 2, block.getX(), PRECISION);
        assertEquals(Block.SIZE * -1, block.getY(), PRECISION);

        figure.rotateClockwise();
        assertEquals(Block.SIZE * 1, block.getX(), PRECISION);
        assertEquals(Block.SIZE * 2, block.getY(), PRECISION);

    }
}