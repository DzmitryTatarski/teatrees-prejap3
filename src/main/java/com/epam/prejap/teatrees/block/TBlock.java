package com.epam.prejap.teatrees.block;

/**
 * Generates a "T" block in the Tetris game - when "1" in a byte array is present then a "#" is printed,
 * otherwise a whitespace (" ") is printed.
 * @see com.epam.prejap.teatrees.block.Block
 * @author Dzmitry_Tatarski
 */

public class TBlock extends Block{

    /**
     * Byte array represents "Y" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *      ###
     *       #
     *  -------------------
     */
    private static final byte[][] IMAGE = {
            {1, 1, 1},
            {0, 1, 0},
    };

    public TBlock() {
        super(IMAGE);
    }
}
