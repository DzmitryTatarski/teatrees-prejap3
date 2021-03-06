package com.epam.prejap.teatrees.block;

/**
 * Generates a "T" block in the Tetris game - when "1" in a byte array is present then a "#" is printed,
 * otherwise a whitespace (" ") is printed.
 * @see com.epam.prejap.teatrees.block.Block
 * @author Dzmitry_Tatarski
 */

final class OBlock extends Block {

    /**
     * Byte array represents "O" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *      ##
     *      ##
     *  -------------------
     */
    private static final byte[][] IMAGE = {
        {1, 1},
        {1, 1},
    };

    public OBlock() {
        super(IMAGE);
    }

}
