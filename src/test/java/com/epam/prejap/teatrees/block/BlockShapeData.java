package com.epam.prejap.teatrees.block;

import org.testng.annotations.DataProvider;

import java.util.*;
import java.util.function.Supplier;

/**
 * Class contains information about which image should each block class contains
 * and generates data for testing
 */

public class BlockShapeData {

    /**
     * Contains block's constructor reference and its expected image for each block to be tested.
     * Feel free to add more shapes here (through static init block). They will be tested automatically.
     */

    private static final Map<Supplier<Block>, byte[][]> blocks = new LinkedHashMap<>(){{
        put(OBlock::new, new byte[][]{
                {1, 1},
                {1, 1}
        });

        put(TBlock::new, new byte[][]{
                {1, 1, 1},
                {0, 1, 0}
        });
    }};

    private static final Map<Class<? extends Block>, Supplier<Block>> classToSupp = new HashMap<>();

    @DataProvider
    public static Iterator<Object[]> blocks() {
        List<Object[]> dpBlocks = new ArrayList<>(blocks.size());
        blocks.forEach((blockNewRef, expectedImage) -> {
            Block blockToTest = blockNewRef.get();
            dpBlocks.add(new Object[]{blockToTest, expectedImage});
            classToSupp.put(blockToTest.getClass(), blockNewRef);
        });
        return dpBlocks.iterator();
    }

    static Iterator<Object[]> getDotAtDataFor(Class<? extends Block> clazz) {
        List<Object[]> data = new LinkedList<>();
        byte[][] image = blocks.get(classToSupp.get(clazz));
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                data.add(new Object[]{i, j, image[i][j]});
            }
        }
        return data.iterator();
    }
}
